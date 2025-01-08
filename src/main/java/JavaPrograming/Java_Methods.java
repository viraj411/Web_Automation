package JavaPrograming;

public class Java_Methods {

   static String st ;
    static int c;

  /*  Methods are lock of codes to do certain task
     1. Predefined methods
     No need to define them
     eg.String.concat();

     2. Userdefined Methods
     Need to defined by users
     syxtax - returntype method_name (signature or parameter){body or implimentation }
eg.
   */
    int addition (int a , int b){
        st="viraj";
        return a+b;
    }
 /* Static methods
 They are belongs to class rather than instance eof class , can be called without creating an object
  */
   static int addition (int x,int y,int z){
       c=44;

       return x+y+z;
   }

    public static void main(String[] args) {
      int result=  addition(4,5,6);
        System.out.println(result);
        Java_Methods j = new Java_Methods();
        j.addition(22,44);
        addition(4,4,6);
        int res= addition(4,4,6);
        System.out.println(res);



    }
}
