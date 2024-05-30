public class Classroom {
    public static void main(String[] args) {
        Wilder jc = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);

        System.out.println(jc.whoAmI());
        System.out.println(henri.whoAmI());
    }
}
