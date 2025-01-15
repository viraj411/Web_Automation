package InterviewQUE;
//Find the largest and smallest elements in an array.

public class LargestSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 99, 0};
        int n = arr.length;
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            System.out.println(largest);
            System.out.println(smallest);

        }
    }
}