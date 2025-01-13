package Arrays;

import java.util.Scanner;

public class StudentmarksArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of first student");

        int[] marks = new int[5];
        int total=0;
        int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;

        for (int i = 0; i<5;i++){
            marks[i] = sc.nextInt(); // Input

            System.out.println(marks[i]);
            total += marks[i];
            highest = Math.max(highest, marks[i]); // Max
            lowest = Math.min(lowest, marks[i]);// Sum

        }

        System.out.println(total);
        int avg= total/5;
        System.out.println(avg);
        System.out.println(highest);
        System.out.println(lowest);



    }
}
