package InterviewQUE;

public class FindEvenOdd {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,6,7,8,9,0,0,12};

        int evencount = 0;
        int oddcount= 0;

        for (int i =0; i<arr.length;i++ ){
            if(arr[i]%2==0){
                evencount++;

            }
            else {
                oddcount++;
            }

        }

        System.out.println(evencount);
        System.out.println(oddcount);


    }
}
