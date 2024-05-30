public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying) {
            this.flying = true;
            this.altitude += 1;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying && this.altitude > 0) {
            System.out.printf("%s glides into the air.%n", this.getName());
        }
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            if (this.altitude - meters > 0) {
                this.altitude -= meters;
                System.out.printf("%s flies downward, altitude: %d%n", this.getName(), this.altitude);
            } else {
                System.out.printf("%s is too high, it can't land.%n", this.getName());
            }
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            this.flying = false;
            System.out.printf("%s lands on the ground .%n", this.getName());
        } else if (this.flying) {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }

}
