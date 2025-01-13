package Arrays;

import java.util.ArrayList;

public class Missing_No {
        public static void main(String[] args) {

            ArrayList <Integer> list = new ArrayList<>();
            int summ = 0;
            list.add(23);
            list.add(3);
            System.out.println(list);
            for (int h=0;h<list.size();h++){
                summ+=list.get(h);

            }

            System.out.println(summ);

            int[] arr = {1, 2, 4, 5, 6};
            int n = 6;  // total count of numbers including the missing one

            int totalSum = n * (n + 1) / 2;
            for (int num : arr) {
                totalSum -= num;
            }

            System.out.println("Missing Number: " + totalSum);
        }
    }
