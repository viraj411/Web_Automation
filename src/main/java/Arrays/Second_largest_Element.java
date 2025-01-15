package Arrays;
import java.util.Arrays;

public class Second_largest_Element {


        public static void main(String[] args) {
            int[] arr = {1,3};



            // Find the second largest element by checking from the end
            int n = arr.length;
            int largest = arr[n - 1];

            // Traverse backwards to find the first different number from the largest
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] != largest) {
                    System.out.println("The second largest element is: " + arr[i]);
                    return;
                }
            }

            // If all elements are the same, no second largest
            System.out.println("There is no second largest element.");
        }

}
