public class App {
    public static void main(String[] args) {
        Email student = new Email();
        System.out.print("\n");
        System.out.println("------Student Details------");
        System.out.println("Name: " +student.getFirstName()+ " " + student.getLastName());
        System.out.println("College: " +student.getCollege());
        System.out.println("Password: " +student.getPassword());
        System.out.println("Your Email is: " +student.getEmail());
    }
}
