package Arrays;

public class Checkingspecificvalue {

    public static void main(String[] args) {
        int[] arr = {23, 54, 6, 7, 8, 5, 3, 2, 5};

        int target = 3;
        //int sum = 0;


        //  for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("value is prasent ");
                break;


            }
            }
        System.out.println("Not Present");
        }}