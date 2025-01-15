package InterviewQUE;

public class CountWords {

    public static void main(String[] args) {
        String st = "I am Viraj";
        int word = 1; // first word doesnt have space
        for (int i=0;i<st.length();i++){
            if(st.charAt(i)==' '){
                word++;
            }
        }
        System.out.println(word);

    }
}
