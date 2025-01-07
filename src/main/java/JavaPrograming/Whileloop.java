package JavaPrograming;

import java.util.Arrays;

public class Whileloop {

    public static void main(String[] args) {

        int i =1  ;
        while (i<=10){
            System.out.println("Hello ");
           i++ ;
        }
        String[] names = {"Alice", "Bob", "Charlie"};

        for (String name : names) {
            System.out.println(name);
        }

        String [] str = {"vv","dfd","dfd"};
       int ri= str.length;
       Arrays.stream(str).count();
        System.out.println(ri);

    }
}
