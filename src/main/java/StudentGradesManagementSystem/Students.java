package StudentGradesManagementSystem;

public class Students {

    private String name;
    private int rollNumber;
    private int sub1grade;
    private int sub2grade;
    private int sub3grade;

    public Students(String name, int rollNumber, int sub1grade, int sub2grade, int sub3grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.sub1grade = sub1grade;
        this.sub2grade = sub2grade;
        this.sub3grade = sub3grade;

    }
    public double getaverage_grade() {
        return (sub1grade + sub2grade + sub3grade) / 3;
    }
    public void StudentsDetails() {
        System.out.println(name + rollNumber + sub1grade + sub2grade + sub3grade +getaverage_grade());
    }



    }

//Fields: name, rollNumber, subject1Grade, subject2Grade, subject3Grade (private fields).