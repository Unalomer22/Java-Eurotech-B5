package odevler;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Login();


    }

    public static void Login() {
        Scanner scan = new Scanner(System.in);
        String userName = "Informatik";
        String pass = "GS1905";
        System.out.println("Enter userName: ");
        String name = scan.nextLine();
        System.out.println("Enter Password: ");
        String password = scan.nextLine();

        if (name.isEmpty() && password.isEmpty()) {
            System.out.println("UserName and Password Fields cannot be empty");
        } else if (name.isEmpty()) {
            System.out.println("UserName cannot be empty");
        } else if (password.isEmpty()) {
            System.out.println("Password cannot be empty");
        } else if (name.equals(userName) && password.equals(pass)) {
            System.out.println("User Logged in successfully");
        } else {
            System.out.println("UserName or password is not valid. Please verify");

        }

    }
}
