package InterviewQUE;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n= arr.length;
        int [] rotated = new int[n];

        for (int i=0;i<n;i++){
            int new_index= (i+k)%n;
            rotated[new_index]= arr[i];

        }

        for(int i =0;i<arr.length;i++){
            System.out.println(rotated[i]);
        }


    }
}
