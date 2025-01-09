package JavaPrograming;

import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.Throw;

public class Con_z {

    // This class is about the constructors
    Con_z(){
        String name ;
        System.out.println("This is a default constructors");
    }

    Con_z(String vi, int q,int r ){
        System.out.println(q+r);
        System.out.println("This is parameterized constructors");


    }

    public int display (int v ,int r) {
        System.out.println("I am viraj");
        return v+r;

    }
    public void greet(String name) {
        if (name == null) {
            return;  // Exits the method if name is null
        }

        System.out.println("Hello, " + name);
    }

public boolean is_true(int b){
        if(b>12){

        }
        return true;

    }
public int vvv  (String er, boolean v, int f  ){
    System.out.println(v);
        return f+3;

}

    public static void main(String[] args) {
        Con_z c = new Con_z();
        c.display(3,5);
        Con_z v = new Con_z("fff",3,5);
        c.greet(null);
        c.is_true(6);
        c.vvv("f",true,5);

    }
}
