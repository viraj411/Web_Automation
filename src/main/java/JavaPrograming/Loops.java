package JavaPrograming;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum = sum + i;
            sum += i;

            System.out.println(sum);
        }

    }

}