package InterviewQUE;

//CheckSpecificElement in an array
public class CheckSpecificElement {
    public static void main(String[] args) {


        int[] arr = {23, 45, 67, 89, 45, 23, 46, 68, 57, 34, 3, 23};
        int target = 3;
        int n = arr.length;

        boolean ispresent = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ispresent = true;
            }

        }

        if (ispresent) {
            System.out.println(target + " is present");
        } else {
            System.out.println(target + " is not present");
        }

    }
}