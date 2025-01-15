package InterviewQUE;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 55, 6, 7, 23, 6, 5, 4};
        Arrays.sort(arr);
        int n = arr.length;
        int largest = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
