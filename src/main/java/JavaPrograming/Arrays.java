package JavaPrograming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arrays {

     void stroing_array() {
        int[] arr2 = {233, 545, 342, 5565, 7878, 232, 2323, 24546};
        int lengt = arr2.length;
        System.out.println(lengt);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        String a1= "viraj";
        ArrayList<String> list = new ArrayList<String>();
        list.add(a1);
        list.add(a1);
        list.add(a1);
        list.add("Abhang");

         System.out.println(list);

         for (int j=0; j<list.size();j++){

             System.out.println(list.get(j));

         }



     }


    public static void main(String[] args) {
 Arrays array = new Arrays();
    array.stroing_array();
    }
}