package OOP;

public class Car  extends Vehicle{

    int numberOfDoors;
   String fuelType;

    void  setNumberOfDoors_fueltype(int whatisnoofdoors,String whatisfueltype){

        numberOfDoors=whatisnoofdoors;
        fuelType=whatisfueltype;

    }
    void displaycardetails(){
        System.out.println("No of Doors is " + numberOfDoors);
        System.out.println("Fuel type is " + fuelType);

    }

}
