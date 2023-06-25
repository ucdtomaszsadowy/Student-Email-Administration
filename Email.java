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
        //System.out.println("Name: " +firstName+ " "+ lastName);

        this.college = setCollege(); 
        //System.out.println("College: "+ college);
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
}
