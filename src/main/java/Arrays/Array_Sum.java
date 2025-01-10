package Arrays;

public class Array_Sum {
    public static void main(String[] args) {


        int[] arr = {12, 45, 656, 767, 877, 33};

        int sum = 0;

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
            sum += arr[i];



        }
        System.out.println(sum);

    }
}