package InterviewQUE;

public class RemoveDuplicates {

    public static void main(String[] args) {
//            int[] arr = {4, 5, 4, 2, 1, 5};
//            System.out.println("Array without duplicates:");
//            for (int i = 0; i < arr.length; i++) {
//                boolean isDuplicate = false;
//                for (int j = 0; j < i; j++) {
//                    if (arr[i] == arr[j]) {
//                        isDuplicate = true;
//                        break;
//                    }
//                }
//                if (!isDuplicate) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//        }
//    }

        int [] arr = {2,44,55,66,66,78,9,9,0,78};
        for(int i=0;i<arr.length;i++){
            boolean isduplicate= false;

            for(int j =0;j<i;j++){
                if(arr[i]==arr[j]){
                    isduplicate= true;
                }
            }
        if(!isduplicate){
            System.out.println(arr[i]);
        }

    }}}