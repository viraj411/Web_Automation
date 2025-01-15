package InterviewQUE;

public class Countvovels {
    public static void main(String[] args) {
        String st = "viraj";
        int countvovel = 0;
        char c;
        for (int i = 0; i < st.length(); i++) {
            c = st.charAt(i);
            if (c == 'a' || c == 'i') {
                countvovel++;
            }
        }
        System.out.println(countvovel);
    }
}