package Arrays;

public class Search_Element {

    public static void main(String[] args) {
        int [] arr = {33,45,65,767,878,24};
        int search_target= 65;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==search_target){
                System.out.println("Element is present");
            }
        }
    }
}
