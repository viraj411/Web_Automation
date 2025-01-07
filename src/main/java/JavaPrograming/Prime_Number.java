package JavaPrograming;

import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO.");
        int input = sc.nextInt();

        if (input % 2 != 0) {
            System.out.println("is prime");
        }
        else {
            System.out.println("Not prime");
        }
    }


}
