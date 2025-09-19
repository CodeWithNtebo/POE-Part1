/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginpoe1;

/**
 *
 * @author RC_Student_lab
 */

//Start of my chatapp login
  //These are my class attributes which store the user's login and registration data 
public class LoginPOE1 {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String cellphone;

    public LoginPOE1() {
        this.firstname = "";
        this.lastname = "";
        this.username = "";
        this.password = "";
        this.cellphone = "";
    }

    public LoginPOE1(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // These are my setter methods generated with the assistance of AI. ChatGPT (OpenAI, 2024)
    public void setFirstName(String firstname) { this.firstname = firstname; }
    public void setLastName(String lastname) { this.lastname = lastname; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setCellphone(String cellphone) { this.cellphone = cellphone; }

    // These are my methods with no parameters.
    public boolean checkUserName() {
        return this.username != null && 
               this.username.contains("_") && 
               this.username.length() <= 5;
    }
    
    //This method is used to check whether the user's password matches the chatapp's password requirements
    public boolean checkPasswordComplexity() {
        if (this.password == null) return false;
        boolean hasCapital = !this.password.equals(this.password.toLowerCase());
       // I have used ChatGPT (OpenAI, 2024) to generate this regex code for the password.
        boolean hasNumber = this.password.matches(".*[0-9].*");
        boolean hasSpecial = this.password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean hasLength = this.password.length() >= 8;
        return hasLength && hasCapital && hasNumber && hasSpecial;
    }
    
    public boolean checkCellPhoneNumber() {
        // Ihave used an AI assistant called ChatGPT (OpenAI, 2024) to generate this regex code.
        String cellRegex = "^\\+27[0-9]{9}$";
        return this.cellphone != null && this.cellphone.matches(cellRegex);
    }
//End of chatapp login
    
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted."
                    + "Please ensure that your username contains an underscore and is no more than five characters in length "
                    + "It should look like this:(kyl_1)";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted."
         + "Please ensure that the password contains at least eight characters,"
                    + " a capital letter, a number and a special character. "
             ;
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        return "Username successfully captured."
                + "Password successfully captured."
                + "Cellphone number successfully added.";
    }
    
    public boolean loginUser() {
        return !this.username.isEmpty() && !this.password.isEmpty();
    }
    
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(this.username) && enteredPassword.equals(this.password);
    }

    public String returnLoginStatus() {
    boolean isLoggedIn = loginUser();
    
    if (isLoggedIn) {
        return "Welcome " + this.firstname + "," + this.lastname + " it is great to see you again.";
    } else {
        return "Username or password incorrect, please try again.";
    }
}

public String returnLoginStatus(boolean isLoggedIn) {
    if (isLoggedIn) {
        return "Welcome " + this.firstname + "," + this.lastname + " it is great to see you again.";
    } else {
        return "Username or password incorrect, please try again.";
    }
}//End of chatapp registration
}