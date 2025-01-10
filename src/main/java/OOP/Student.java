package OOP;

public class Student {

  public   void student_details(String name,int age){

        System.out.println("Student name is " +name+ " and age is "+ age );
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.student_details("Viraj",29);

    }
}
