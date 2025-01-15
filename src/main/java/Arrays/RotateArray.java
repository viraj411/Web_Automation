package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        // Initialize the array
//            int[] arr = {1, 2, 3, 4, 5, 6,7};
//            int k = 3; // Number of positions to rotate
//
//            // Length of the array
//            int n = arr.length;
//
//            // Create a temporary array to store the rotated result
//            int[] rotated = new int[n];
//
//            // Perform the rotation manually
//            for (int i = 0; i < n; i++) {
//                int newIndex = (i + k) % n; // Calculate the new index for each element
//                rotated[newIndex] = arr[i];
//            }
//
//            // Print the rotated array
//            for (int i = 0; i < n; i++) {
//                System.out.print(rotated[i]);
//
//            }}
//.
//Intialize an array

        int [] arr = {1,2,3,4,5,6,7};
        int k=3;
         int  n= arr.length;
        int [] rotated = new int[n];

        for ( int i =0; i<n; i++){
            int new_index = (i+k)%n;


            // (i-k+n)%n this is for left rotation by k position
            rotated[new_index] = arr[i];

        }
        for (int i =0 ; i<n ; i++){
            System.out.println(rotated[i]);
        }
    }}