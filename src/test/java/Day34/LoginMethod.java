package Day34;

import java.util.Scanner;

public class LoginMethod {
    public static void main(String[] args) {
        String userName;
        String password;

        userName = "EuroTech";
        password = "Study";

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter UserName : ");
        String inputUserName = scan.nextLine();

        System.out.println(" Enter Password");
        String inputPassword = scan.nextLine();

        // Method call to check if login is granted
        login(userName, password, inputUserName, inputPassword);
    }
        private static void login
        (String userName,String password,String inputUserName,String inputPassword){
            if(userName.equals(inputUserName) && password.equals(inputPassword)){
                System.out.println(" User logged in successfully");

            }else if (inputUserName.isEmpty() && inputPassword.isEmpty()){
                System.out.println(" UserName and Password Fields cannot be empty");

            }else if (inputUserName.isEmpty() & !inputPassword.isEmpty()){
                System.out.println(" UserName cannot be empty");

            }else if (!inputUserName.isEmpty() & inputPassword.isEmpty()){
                System.out.println(" Password cannot be empty");

            }else // if (!userName.equals(inputUserName) || !(password.equals(inputPassword))){
                System.out.println(" UserName or Password is not valid. Please verify");
            }
        }




