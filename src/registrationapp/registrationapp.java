
package registrationapp;


/**
 *
 * @author USER
 */
import java.util.Scanner;

public class registrationapp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        String firstName;
        String lastName;
        String username;
        String password;
        String phoneNumber;

        // Registration Inputs
        System.out.print("Enter your First Name: ");
        firstName = input.nextLine();

        System.out.print("Enter your Last Name: ");
        lastName = input.nextLine();

        System.out.print("Enter username (must not be more than 5 characters and must have a '_'): ");
        username = input.nextLine();

        System.out.print("Enter password (must have 8 characters or more, at least 1 number, a capital letter and a special character): ");
        password = input.nextLine();

        System.out.print("Enter cellphone number (must have a South African international code '+27'): ");
        phoneNumber = input.nextLine();
        
        //show userfeedback
        System.out.println(login.checkUserName(username));
        System.out.println(login.checkPasswordComplexity(password));
        System.out.println(login.checkCellPhoneNumber(phoneNumber));

        // Register Outcome
        boolean registered = login.registerUser(username, password, phoneNumber);

        if (registered) {
            System.out.println("Registration successful.");
        } else {
            System.out.println("Registration failed.");
        }
        
// LOGIN SECTION
if (registered){

    System.out.println("Login");

    System.out.print("Enter username: ");
    String loginUser = input.nextLine();

    System.out.print("Enter password: ");
    String loginPassword = input.nextLine();

    // LOGIN FLAG
    boolean authenticated = login.loginUser(loginUser, loginPassword);

    System.out.println(login.returnLoginStatus(firstName, lastName, authenticated));
 }
    }
}

   



