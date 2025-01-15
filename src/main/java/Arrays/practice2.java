package Arrays;
public class practice2 {
    public static void main(String[] args) {

        String st = " Viraj Abhang";
        String rev = "";
        for (int i = st.length() - 1; i >= 0; i--) {

            rev += st.charAt(i);

        }
        System.out.println("Reverse String is " + rev);


        //  int [] arr =new int[5];
        int[] arr = {23, 54, 76, 87, 4, 2};

        for (int j = arr.length - 1; j >= 0; j--) {

            System.out.println(arr[j]);

        }
    }
}