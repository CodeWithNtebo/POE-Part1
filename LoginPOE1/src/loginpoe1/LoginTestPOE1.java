/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpoe1;
/**
 *
 * @author RC_Student_lab
 */
public class LoginTestPOE1 { 

    
    public static void main(String[] args) {
        LoginPOE1 login = new LoginPOE1();

        
        System.out.println("=== TESTING LOGIN POE METHODS ===");
        
        // Test the constructors
        System.out.println("\n0. Testing Constructors:");
        LoginPOE1 user1 = new LoginPOE1(); // default constructor
        LoginPOE1 user2 = new LoginPOE1("test_1", "Pass123!", "+27831234567"); // parameterized constructor
        System.out.println("Default constructor works: " + (user1 != null));
        System.out.println("Parameterized constructor works: " + (user2 != null));
        
        // Test 1: Username validation
        System.out.println("\n1. Testing Username Validation:");
        System.out.println("'kyl_1' (should be true): " + login.checkUserName("kyl_1"));
        System.out.println("'kyle!!!!!!' (should be false): " + login.checkUserName("kyle!!!!!!"));
        
        // Test 2: Password complexity
        System.out.println("\n2. Testing Password Complexity:");
        System.out.println("'Ch&&sec@ke99!' (should be true): " + login.checkPasswordComplexity("Ch&&sec@ke99!"));
        System.out.println("'password' (should be false): " + login.checkPasswordComplexity("password"));
        
        // Test 3: Cell phone validation
        System.out.println("\n3. Testing Cell Phone Validation:");
        System.out.println("'+27838968976' (should be true): " + login.checkCellPhoneNumber("+27838968976"));
        System.out.println("'08966553' (should be false): " + login.checkCellPhoneNumber("08966553"));
        
        // Test 4: Registration and Login functionality
        System.out.println("\n4. Testing Registration and Login:");
        String result = login.registerUser("test_1", "Pass123!", "+27831234567");
        System.out.println("Registration result: " + result);
        System.out.println("Login with correct credentials (should be true): " + login.loginUser("test_1", "Pass123!"));
        System.out.println("Login with wrong password (should be false): " + login.loginUser("test_1", "wrong"));
        
        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}