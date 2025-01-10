package p1;

public class Geek {

 public static int display (){

     int sum=0;

     for (int i =1; i<=10; i++ ){

         sum+=i;
     }
     System.out.println(sum);


     return sum;
 }

    public static void main(String[] args) {
     display();

    }
}
