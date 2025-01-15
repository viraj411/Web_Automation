package InterviewQUE;

public class Findduplicate {
    public static void main(String[] args) {
        int[] arr = {12, 2, 34, 54, 56, 65,};
        boolean isduplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isduplicate = true;
                }

            }
        }
        if (isduplicate) {
            System.out.println("duplicate");
        } else {
            System.out.println("No duplicate");
        }
    }}


