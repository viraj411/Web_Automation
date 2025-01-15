package InterviewQUE;

public class Sum_Element {
    public static void main(String[] args) {


        int[] arr = {23, 45, 65, 76, 87, 98, 9, 0, 9, 8};
        int sum = 0;

        for (int i = 0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}