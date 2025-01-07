package OOP;

public class Main {

    public static void main(String[] args) {

        Child ch = new Child();
        Car c = new Car();
        c.setvehilcedetails("BMW", "X6");
        c.displayvehilcedetails();
        c.setNumberOfDoors_fueltype(4, "Petrol");
        c.displaycardetails();
        ch.setDisplay_person_detailsaldetails("Viraj", 29);
        ch.display_person_details();
        ch.setStudentDetails(44, 'A');
        ch.displayStudentDetails();
    }
}
//Scenario: School Management System
//Imagine you're developing a simple School Management System. In this system:
//
//Person Class (Parent):
//
//Represents any general person in the school (e.g., student, teacher, staff).
//Contains basic details like name and age.
//Provides functionality to set and display personal details.
//Student Class (Child):
//
//Inherits basic attributes (like name and age) from the Person class.
//Adds student-specific attributes like rollNumber and grade.
//Provides additional functionality to set and display student-specific details.
//This system demonstrates single inheritance where the Student class builds upon the Person class.