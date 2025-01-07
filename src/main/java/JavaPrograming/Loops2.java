package JavaPrograming;

import java.util.Random;
import java.util.Scanner;

public class Loops2 {

        public static void main(String[] args) throws InterruptedException {
            monkeyTesting();

        }
            public static void monkeyTesting() throws InterruptedException {
                int eventCount = 1000;
                Random random = new Random();
                for (int i = 0; i < eventCount; i++) {
                    int x = random.nextInt(1080);
                    int y = random.nextInt(1920);
                    Thread.sleep(random.nextInt(50));
                }
            }
//            // Create a Scanner object for user input
//            Scanner scanner = new Scanner(System.in);
//
//            // Prompt the user to enter a number
//            System.out.print("Enter the number for the multiplication table: ");
//            int n = scanner.nextInt();
//
//
//            // Print the multiplication table using a for loop
//            System.out.println("Multiplication Table of " + n + ":");
//            for (int i = 1; i <= 10; i++) {
//                int result = n * i; // Calculate the product
//                System.out.println(n + " x " + i + " = " + result);
//            }
//
//            // Close the scanner
//            scanner.close();
//        }


            }

