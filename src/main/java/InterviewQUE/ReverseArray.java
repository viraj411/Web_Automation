package InterviewQUE;

public class ReverseArray {
    // Reverse an array
    public static void main(String[] args) {


        //int [] arrr = new int[7];
        int[] arr = {2,2,4,5,6,7};
        int n = arr.length;
        System.out.println(n);

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);

        }
    }
}