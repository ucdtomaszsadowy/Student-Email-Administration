public class App {
    public static void main(String[] args) {
        Email student1 = new Email();
        System.out.print("\n");
        System.out.println("------Student Details------");
        System.out.println("Name: " +student1.getFirstName()+ " " + student1.getLastName());
        System.out.println("College: " +student1.getCollege());
    }
}
