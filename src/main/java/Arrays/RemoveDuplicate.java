package Arrays;
import java.util.Arrays;

public class RemoveDuplicate {


        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 4, 1, 5};

            // Find the length of the new array after removing duplicates
            int length = arr.length;

            // Iterate through the array and compare each element
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (arr[i] == arr[j]) {
                        // Shift elements to the left to remove the duplicate
                        for (int k = j; k < length - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        length--;  // Reduce the size of the array
                        j--;  // Recheck the current index
                    }
                }
            }

            // Print the array after removing duplicates
            System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, length)));
        }
    }


