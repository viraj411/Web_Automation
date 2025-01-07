package JavaPrograming;

import java.util.Scanner;

public class ConditionalStatement3 {
    public static void main(String[] args) {


        //  Problem: Write a Java program to determine whether a given year is a century year or not.

        //  A year is a century year if it is divisible by 100 (e.g., 1700, 1800, 1900).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year < 100 || year > 2024) {
            System.out.println("Enter a valid year between 100 and 2024.");
        } else {
            // Check if it's a century year
            if (year % 100 == 0) {
                System.out.println(year + " is a century year.");
            } else {
                System.out.println(year + " is not a century year.");
            }
        }


    }


}
