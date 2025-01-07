package JavaPrograming;

import com.sun.source.tree.BreakTree;
import com.sun.source.tree.Tree;

public class Return_keyword {
    public static void main(String[] args) {
        Return_keyword R = new Return_keyword();
        R.add_number(2, 3);
        R.show_message("Hi Viraj");
        R.multiply(35,55);

    }

    public int add_number(int a, int b) {
        System.out.println(a+b);
        return a+b;

    }

    public void show_message(String messagee) {

        System.out.println(messagee);


    }

    public int multiply(int w, int q) {
        System.out.println(w * q);
        return w*q ;

    }
}