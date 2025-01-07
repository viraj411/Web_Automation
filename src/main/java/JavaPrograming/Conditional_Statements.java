package JavaPrograming;

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {


// if age >18 not eligible to vote
        //else  <18

        //  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age");
//        int age = sc.nextInt();
//        System.out.println("Enter the Marks");
//
//        int marks = sc.nextInt();
//
//        if (age >= 18 && marks >= 75) {
//            System.out.println("eligible to vote");
//        }  else if (age>=18 && marks<=75 ){
//            System.out.println("Increase your marks");
//        }
//        else if (age<=18&& marks>=75){
//            System.out.println("increse your age");
//        }
//        else {
//            System.out.println("Not eligible to vote");
//        }
//    }
//}

//        try {
//            System.out.println("Enter your age:");
//            int age = sc.nextInt();
//
//            if (age < 0) {
//                System.out.println("Age cannot be negative.");
//                return;
//            }
//
//            System.out.println("Enter your marks:");
//            int marks = sc.nextInt();
//
//            if (marks < 0 || marks > 100) {
//                System.out.println("Marks should be between 0 and 100.");
//                return;
//            }
//
//            if (age >= 18 && marks >= 75) {
//                System.out.println("You are eligible to vote.");
//            } else if (age >= 18 && marks < 75) {
//                System.out.println("Improve your marks to become eligible.");
//            } else if (age < 18 && marks >= 75) {
//                System.out.println("Increase your age to become eligible.");
//            } else {
//                System.out.println("You are not eligible to vote.");
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter numeric values.");
//        } finally {
//            sc.close();
//        }
//    }
//}Write a Java program that accepts three numbers as input from the user and uses if-else statements to determine the largest number among them.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 No");

        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd No");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd No");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Num1 is greater " + num1);
        } else if (num2 >= num1 && num2 > num3) {
            System.out.println("Num2 is grater " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("Num3 is greater " + num3);


        } else {
            System.out.println("");
        }


    }
}

