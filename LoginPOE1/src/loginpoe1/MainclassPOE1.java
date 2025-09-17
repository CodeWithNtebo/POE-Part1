/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpoe1;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class MainclassPOE1 {

  
    public static void main(String[] args) {
        LoginPOE1 login = new LoginPOE1();
        
        // Registration
        String username = JOptionPane.showInputDialog("Please enter your username:");
        String password = JOptionPane.showInputDialog("Please enter your password:");
        String cell = JOptionPane.showInputDialog("Please enter your cellphone number:");

        String regResult = login.registerUser(username, password, cell);
        JOptionPane.showMessageDialog(null, regResult);

        // If registration failed, exit
        if (!regResult.contains("Yippie! You are registered successfully.")) {
            return;
        }

        // Login
        String enteredUser = JOptionPane.showInputDialog("Please enter your username to login:");
        String enteredPass = JOptionPane.showInputDialog("Please enter your password to login:");

        boolean isLoggedIn = login.loginUser(enteredUser, enteredPass);
        String loginStatus = login.returnLoginStatus(isLoggedIn, "User", "Name");

        JOptionPane.showMessageDialog(null, loginStatus);
    }
}

    

