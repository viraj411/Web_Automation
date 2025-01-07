package OOP;

public class Vehicle {
    String brand;
    String model;

    void setvehilcedetails(String brand,String model){

       this.brand=brand;
       this.model=model;

    }
    void displayvehilcedetails(){
        System.out.println("Brand is " + brand);
        System.out.println("Model is " +model);

    }
}
