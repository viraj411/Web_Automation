package Arrays;

public class Maximum_andminimum {
    public static void main(String[] args) {
        int [] arr = {2,4,6,89,3,1};
                // Example input array

                // Initialize max and min with the first element of the array
                int max = arr[0];
                int min = arr[0];

                // Iterate through the array to find max and min
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];  // Update max if current element is greater
                    }
                    if (arr[i] < min) {
                        min = arr[i];  // Update min if current element is smaller
                    }
                }

                // Output the maximum and minimum values
                System.out.println("Maximum: " + max);
                System.out.println("Minimum: " + min);
            }
        }


