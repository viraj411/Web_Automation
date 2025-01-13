package JavaPrograming;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        int[] arr = {123,5432,7564,234,876,234597867,23546534};
     //   for (type variable : collection)  Enhanced for loop

        for (int num :arr) {
            System.out.println(num);

        }
    }}
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the No.");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//            sum = sum + i;
//            sum += i;
//
//            System.out.println(sum);
//        }
//
//    }
//
//}