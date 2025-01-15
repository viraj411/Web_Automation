package Arrays;

public class Duplicate_Element {

    public static void main(String[] args) {


        int[] arr = { 3, 4, 5,6, 6, 7};

        for (int i = 0; i < arr.length; i++) {

            for (int j=i+1; j < arr.length ;j++){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is duplicate");
                }
            }

        }
              //   System.out.println("no duplicate");
    }
}