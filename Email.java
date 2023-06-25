import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String college;
    private String altEmail;
    private int maxCapacity;

    public Email(){
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.college = setCollege(); 
        this.password = generatePassword();
    }

    //Asking student for details

    //First Name Setter
    private String setFirstName(){
        System.out.print("Enter your First Name: ");
        Scanner in = new Scanner(System.in);
        String studentFirstName = in.nextLine();
        System.out.print("\n");

        return studentFirstName;
    }

    //First Name Getter
    String getFirstName(){
        return firstName;
    }

    //Last Name Setter
    private String setLastName(){
        System.out.print("Enter your Last Name: ");
        Scanner in = new Scanner(System.in);
        String studentLastName = in.nextLine();
        System.out.print("\n");

        return studentLastName;
    }

    //Last Name Getter
    String getLastName(){
        return lastName;
    }

    //College Setter
    private String setCollege(){
        System.out.print("Please enter your UCD College: Science, Engineering, Business or Health: ");
        Scanner in = new Scanner(System.in);
        String userCollege = in.nextLine();

        if (userCollege.matches("Science") || userCollege.matches("science")){
            return "Science";
        }
        else if (userCollege.matches("Engineering") || userCollege.matches("engineering")){
            return "Engineering";
        }
        else if (userCollege.matches("Business") || userCollege.matches("business")){
            return "Business";
        }
        else if (userCollege.matches("Health") || userCollege.matches("health")){
            return "Health";
        }
        else{
            return "Invalid College";
        }
    }

    String getCollege(){
        return college;
    }

    private String generatePassword() {
        String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int passwordLength = 8; // Adjust the length as needed
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = (int) (Math.random() * validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }

    // Password Getter
    String getPassword() {
        return password;
    }
}
