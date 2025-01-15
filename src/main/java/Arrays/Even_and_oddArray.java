package Arrays;

public class Even_and_oddArray {
    public static void main(String[] args) {


        int[] arr = {2, 3, 5, 8, 6, 5, 9, 10,33};
        int n = arr.length;

        int even_count= 0;
        int odd_count=0;



        for (int i = 0; i < n;i++){
            if(arr[i]%2==0){
                even_count++;

            }
            else {
                odd_count++;

        }
        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
