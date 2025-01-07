package JavaPrograming;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();

        String revesred = "";

        for (int i=input.length()-1;i>=0;i--){

         //   revesred = revesred+input.charAt(i);
            revesred += input.charAt(i);
            //System.out.println(revesred);

        }
        System.out.println(revesred);




    }
}

