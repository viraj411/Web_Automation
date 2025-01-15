package InterviewQUE;

public class Check_AsecdingDescending {
    public static void main(String[] args) {
        int[] arr ={12,13,45,67,89};
        boolean isacending= true;
        boolean isdescending = true;

        for (int i =0 ;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isacending = false;

                if(arr[i]<arr[i+1]){
                    isdescending=false;
                }
            }
        }
        if(isacending){
            System.out.println("Ascending");
        }
        else if (isdescending){
            System.out.println("Descending");

        }

    }

}
