package InterviewQUE;

public class Palindrome {
    public static void main(String[] args) {
        String input = "SAAS";
        String rev = "";
        for (int i =input.length()-1;i>=0;i--){
            rev= rev+ input.charAt(i);
        }
        if (input.equals(rev)){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
