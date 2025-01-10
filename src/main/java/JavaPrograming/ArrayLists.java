package JavaPrograming;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayLists list = new ArrayLists();
        list.StoreStirnglist();
        list.StoringintList();
        list.basicarraystroring();

    }


    ArrayList<Integer> listi = new ArrayList<Integer>(3);

    ArrayList<String> lists = new ArrayList<String>(0);

    int [] arr= new int[3];



    public void StoreStirnglist() {
        lists.add("viraj");
        lists.add("Pandit");
        lists.add("Abhang");
        lists.add("kuku");

        for (int i= lists.size()-1; i>=0; i--) {

            System.out.println(lists.get(i));
        }
    }

    public void StoringintList() {
        int sum = 0;

        listi.add(12);
        listi.add(34);
        listi.add(132);
        listi.add(225);
        listi.add(223);
        listi.add(15342);
        listi.add(2542);
        listi.add(12545);
        listi.add(2254);
        listi.add(12343);
        listi.add(2278);
        listi.add(1431);
        listi.add(2232);
        for (int j = 0; j < listi.size(); j++) {
            sum += listi.get(j);
        }            System.out.println(sum);

    }
    public void basicarraystroring(){

        arr[0]=(1);
        arr[1]=(13);
        arr[2]=(16);

        for (int k = arr.length-1;k>=0;k--){
            System.out.println(arr[k]);
        }


    }

}
