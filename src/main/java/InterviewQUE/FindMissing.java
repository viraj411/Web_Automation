package InterviewQUE;

public class FindMissing {
    public static void main(String[] args) {


    int [] arr = {1,2,4,5,6};
    int n= arr.length+1;
    int totalsum= n*(n+1)/2;
    for (int i=0;i<arr.length;i++){

        totalsum = totalsum-arr[i];

    }
        System.out.println(totalsum);

}
}
