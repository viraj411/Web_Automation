package JavaPrograming;

import java.math.MathContext;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // How to declare the string ?
        //   By String literals
        String st = "I am Viraj";

        //   By using new Key word
        String st1 = new String("I am Virajj");
        System.out.println(st);
        System.out.println(st);

        //String Methods
        // 1.length
        String st2 = "Viraj Abhang";
        System.out.println(st2.length());

        // 2.concatination
        String st3 = "I am viraj";
        String st4 = "I am Sumit";
        System.out.println(st3 + st4);
        System.out.println(st3.concat(st4));

        //  3. comparison
        String st5 = "RaHul";
        String st6 = "Rahul";
        String st7 = "Rahul";
        boolean compare = st5.equals(st7);
        boolean compre2 = st5.equalsIgnoreCase(st7);
        System.out.println(compare);
        System.out.println(compre2);

        int otp = (int) (Math.random()*9000) +1000 ;// Generates a random number between 1000 and 9999
        System.out.println(otp);
//        if (otp % 2 == 0) {
//
//            System.out.println(otp + " is Even");
//
//
//        } else {
//            System.out.println(otp + " is odd");
//        }
//
//        for (int i = otp; i >= 1; i--) {
//            System.out.println(i);


        }
    }

