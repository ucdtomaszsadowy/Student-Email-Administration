import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Email> students = new ArrayList<Email>();
        String input = "";

        while (true) {
            System.out.println("Do you want to input a new student? (yes/no):");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            if(input.equalsIgnoreCase("no")) {
                break;
            } else if(input.equalsIgnoreCase("yes")) {
                Email student = new Email();
                students.add(student);
            } else {
                System.out.println("Invalid input! Please enter 'yes' to continue or 'no' to stop.");
            }
        }
        //Admninistrator can view all student details
        while(true){
            System.out.println();
            System.out.println("Enter student's full name to fetch details, or type 'exit' to stop: ");
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            if(option.matches("exit")){
                break;
            }

            boolean found = false;

            for (Email student : students) {
                if ((student.getFirstName() + " " + student.getLastName()).equalsIgnoreCase(option)){
                    System.out.println();
                    System.out.println("------Student Details------");
                    System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                    System.out.println("College: " + student.getCollege());
                    System.out.println("Password: " + student.getPassword());
                    System.out.println("Student Email: " + student.getEmail());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found!");
            }


        }
    }
}
