/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginpoe1;

/**
 *
 * @author RC_Student_lab
 */

public class LoginPOE1 {
    // These are fields for storing user data
    private String username;
    private String password;
    private String cellphone;

    public LoginPOE1() {
        this.username = "";
        this.password = "";
        this.cellphone = "";
    }

    // This is a constructor with parametrs
    public LoginPOE1(String username, String password, String cellphone) {
        this.username = username;
        this.password = password;
        this.cellphone = cellphone;
    }

    // These are methods to return user data
    public String getUsername() { 
        return username; 
    }
    
    public void setUsername(String username) { 
        this.username = username; 
    }
    
    public String getPassword() { 
        return password; 
    }
    
    public void setPassword(String password) { 
        this.password = password; 
    }
    
    public String getCellphone() { 
        return cellphone; 
    }
    
    public void setCellphone(String cellphone) { 
        this.cellphone = cellphone; 
    }

    // These are methods to check whether the user input matches the requirements
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
  public boolean checkPasswordComplexity(String password) {
    boolean hasCapital = !password.equals(password.toLowerCase());
    boolean hasNumber = password.matches(".*0123456789.*");
    boolean hasSpecial = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    boolean hasLength = password.length() >= 8;
    
    System.out.println("Please check if your  password meets the requirements: '" + password + "'");
    System.out.println("Does your password have at least 8 characters? " + hasLength);
    System.out.println("Does your password have a capital letter? " + hasCapital);
    System.out.println("Does your password have a number? " + hasNumber);
    System.out.println("Does your password have a special character? " + hasSpecial);
System.out.println("Password validation: " + 
        (hasLength && hasCapital && hasNumber && hasSpecial ? "Password is successfully captured" :
                "Password is not correctly formatted"));    
    return hasLength && hasCapital && hasNumber && hasSpecial;
}
    
    public boolean checkCellPhoneNumber(String cell) {
        return cell.startsWith("+27") && cell.length() == 13;
    }
    
    public String registerUser(String username, String password, String cell) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(cell)) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

//These are feilds for the stores  user data
this.username = username;
        this.password = password;
        this.cellphone = cell;
        
return "Username successfully captured.\n" +
           "Password successfully captured.\n" +
           "Cell phone number successfully added."; 
    }
    
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(this.username) && enteredPassword.equals(this.password);
    }
    
    public String returnLoginStatus(boolean isLoggedIn, String firstName, String lastName) {
        return isLoggedIn ? "Welcome " + firstName + "," + lastName + " it is great to see you again." 
                          : "Username or password incorrect, please try again.";
    }
    
    //This method is for user login when the user is logged in
    public String returnLoginStatus(boolean isLoggedIn) {
        return isLoggedIn ? "Login successful! Welcome back." 
                          : "Username or password incorrect, please try again.";
    }
    
// This method compares entered user details with stored user details to validate the user login
    public boolean loginUser(String enteredUsername, String enteredPassword, String storedUsername, String storedPassword) {
        return enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword);
    }
}

    

