package OOP;

public class Child extends Parents {

    int roll_number;
    char grade;

    void setStudentDetails(int roll_number, char grade) {
        this.roll_number = roll_number;
        this.grade = grade;


    }

    void displayStudentDetails() {
        System.out.println("Roll No" + roll_number);
        System.out.println("Grade" + grade);
    }


}
