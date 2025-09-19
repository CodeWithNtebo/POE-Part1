/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpoe1;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class MainclassPOE1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginPOE1 login = new LoginPOE1();

        // This requests the user's info
        System.out.print("Hey there. Please enter your first name: ");
        String firstName = scanner.nextLine();
        login.setFirstName(firstName);
        
        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();
        login.setLastName(lastName);
        
        System.out.print("Please enter your username: ");
        String username = scanner.nextLine();
        login.setUsername(username);
        
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();
        login.setPassword(password);
        
        System.out.print("Please enter your cellphone number (+27838968976): ");
        String cellphone = scanner.nextLine();
        login.setCellphone(cellphone);

        String registrationMessage = login.registerUser();
        System.out.println(registrationMessage);

        // This conditional logic is used to check if the user's registration failed
        if (registrationMessage.contains("not correctly formatted") || 
            registrationMessage.contains("incorrectly formatted")) {
            System.out.println("Registration failed. Please try again.");
            scanner.close();
            return;
        }

        // This is the chatapp login 
        System.out.print("Please enter your username for login: ");
        String loginUsername = scanner.nextLine();
        
        System.out.print("Please enter your password for login: ");
        String loginPassword = scanner.nextLine();

        boolean isLoggedIn = login.loginUser(loginUsername, loginPassword);
        String loginStatus = login.returnLoginStatus(isLoggedIn);
        System.out.println(loginStatus);

        scanner.close();
    }
}
