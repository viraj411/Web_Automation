package JavaPrograming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Java program to demonstrate the use of static variable
public class Statickeyword {
    private static final Logger log = LoggerFactory.getLogger(Statickeyword.class);
    int rollno; // instance variable
    String name;
    static String college ="Moedern college";
    Statickeyword (int rollno,String name) {
        this.name=name;
        this.rollno=rollno;
    }
    void display (){
        System.out.println(name+rollno+college);
    }
    
    void set () {
    }
    public static void main(String[] args) {
        Statickeyword stt = new Statickeyword(45,"viraj");
        Statickeyword stt2 = new Statickeyword(43,"Abhang");
        stt.display();
        stt2.display();
        
    }
    
}