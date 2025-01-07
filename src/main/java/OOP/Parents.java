package OOP;

public class Parents {
    String name;
    int age;

    void setDisplay_person_detailsaldetails(String persons_name, int personage) {

        name = persons_name;
        age = personage;

    }

    void display_person_details() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);

    }

}


