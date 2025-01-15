package Arrays;

public class Search_Element {

    public static void main(String[] args) {
//        int [] arr = {33,45,65,767,878,24};
//        int search_target= 65;
//
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]==search_target){
//
//
//                System.out.println("Element is present");

        int[] arr = {1, 2, 34, 5, 65, 78, 98};
        int n = arr.length;

        int target = 9;
        boolean is_present = false;

        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                is_present = true;
                break;
            }

        }
        if (is_present) {
            System.out.println(target + " Is present");
        } else {
            System.out.println(target + " Is Not present  ");
        }

    }
}


