package Arrays;

public class FirstRepeatedElement {


    public static void main(String[] args) {

        String st = "SAS";
        String rev="";

        for (int i=st.length()-1;i>=0;i--){

            rev+=st.charAt(i);
        }
        System.out.println(rev);

        if(st.equals(rev)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not plaindrome" );
        }
    }
}