package JavaPrograming;

import java.util.Scanner;

public class Sample_Login_Form {

//    Problem 9: Simple Login System
//    Write a Java program to simulate a simple login system with hardcoded username and password. If the user enters incorrect credentials, display an error message.
//
//    Sample Input:
//    Enter username: admin
//    Enter password: pass123
//    Sample Output:
//    Login successful.

    public static void main(String[] args) {
//        final String actual_username = "admin";
//        final String actual_password = "pass123";
//
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the username");
//        String username = sc.nextLine();
//        System.out.println("Enter the Password");
//        String password = sc.nextLine();
//
//
//        if (actual_username.equals(username) && actual_password.equals(password)) {
//            System.out.println("Login successful");
//        } else {
//            System.out.println("Please try again");
//        }
//        Write a Java program to check whether a given character is uppercase, lowercase, or not an alphabet.
//
//                Sample Input:
//        Enter a character: A
//        Sample Output:
//        The character is uppercase.

//        System.out.println("Enter  the character");
//        char ch = sc.next().charAt(0);
//
//        if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("IS UPPERCASE");
//        } else if (ch >= 'a' && ch <= 'z') {
//            System.out.println("is lowercase");
//
//        }
//else {
//            System.out.println("Is not a character");
//        }
//
//  Problem 6: Electricity Bill Calculator
//Write a Java program to calculate the electricity bill based on the following criteria:
//
//For the first 100 units, the rate is ₹5 per unit.
//For the next 200 units, the rate is ₹7 per unit.
//Above 300 units, the rate is ₹10 per unit.

        System.out.println("Enter the unit");
        int unit = sc.nextInt();
        int rate;

        if (unit >= 0 && unit <= 100) {
            rate = unit * 5;
            System.out.println("The electricity bill " + rate + " Rs");
        } else if (unit > 100 && unit < 300) {
            rate = unit * 7;
            System.out.println("The electricity bill " + rate + " Rs");

        } else if (unit >= 300) {
            rate = unit * 10;
            System.out.println("The electricity bill " + rate + " Rs");
        } else {
            return;
        }

    }
}
