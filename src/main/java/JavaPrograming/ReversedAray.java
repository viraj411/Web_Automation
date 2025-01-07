package JavaPrograming;

import java.util.Scanner;
public class ReversedAray {

    public static void main(String[] args) {


        String [] array = {"Viraj","Rahul"};  // Hardcoded array

//
//        System.out.println("Reversed array:");
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//

        for (int i = array.length -1 ; i>=0;i--){

        System.out.println(array[i]+"");





        }

        String a = "Viraj Abhang";

        String rev ="";

        for (int t = a.length()-1;t>=0;t--){

            rev = rev+ a.charAt(t);

        }
        System.out.println(rev);
    }
}
