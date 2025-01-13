package Arrays;
import java.util.Arrays;

public class Sorting_Array {


        public static void main(String[] args) {
            // Sample array for sorting
            int[] numbers = {12, 5, 3, 9, 2, 8, 6};

            // Printing the original array
            System.out.println("Original Array: " + Arrays.toString(numbers));

            // Sorting the array using Arrays.sort()
            Arrays.sort(numbers);

            // Printing the sorted array
            System.out.println("Sorted Array: " + Arrays.toString(numbers));
        }


}
