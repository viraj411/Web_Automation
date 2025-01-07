package JavaPrograming;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    static String vvv ="f";

    public static void main(String[] args) {


        Palindrome p = new Palindrome();
        p.mm(vvv);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();
        String strl= str.toLowerCase();
        System.out.println(strl);

        StringBuilder stb= new StringBuilder(strl);

         String reverse = String.valueOf(stb.reverse());
        System.out.println(reverse);
        if (strl.equals(reverse)){
            System.out.println("it is palindrome");

        }
        else{
            System.out.println("it is not palindrome");
        }


        }


        public void mm(String vvv){
        this.vvv=vvv;

            System.out.println(vvv);


        }


    }

