package JavaPrograming;

import java.util.Scanner;
import java.util.logging.Logger;

public class conditional_Statement2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the No");
//        int check_no= sc.nextInt();
//        if(check_no>0){
//            System.out.println("positive");
//
//        }
//        else if (check_no<0){
//            System.out.println("Negative");
//
//        }
//        else {
//            System.out.println("Zero");
//        }
//    }
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >=100) {
            System.out.println("please enter the mark between 0 to 100");
        }
            else if (marks >= 90) {
                System.out.println("You have Grade A.");
            } else if (marks >= 70) {
                System.out.println("You have Grade B.");
            } else if (marks >= 50) {
                System.out.println("You have Grade C.");
            } else if (marks >= 35) {
                System.out.println("You have Grade D.");
            } else {
                System.out.println("You have failed.");
            }

            sc.close();
        }
    }