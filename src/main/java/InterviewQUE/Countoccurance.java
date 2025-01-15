package InterviewQUE;

public class Countoccurance {

    public static void main(String[] args) {
        String st = "VIRAJJJJJ";
        int count = 0;
        char c= 'J';
        for (int i=0;i<st.length();i++){
          if(st.charAt(i)==c)
              count++;
        }
        System.out.println(count);
    }
}
