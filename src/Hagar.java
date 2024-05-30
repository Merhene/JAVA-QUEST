public class Hagar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 76752);
        Boat titanic = new Boat("Titanic", 2700);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
