package JavaPrograming;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight in kg");

        float weight = sc.nextFloat();

        System.out.println("Enter the Height in Meter");

        float Height = sc.nextFloat();

        float BMI = weight / (Height * Height);
        System.out.println(BMI);


//        BMI < 18.5: Underweight
//        BMI 18.5–24.9: Normal weight
//        BMI 25–29.9: Overweight
//        BMI ≥ 30: Obesity

        if (BMI < 18.5) {
            System.out.println("You are underweight");

        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal weight");

        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Overweight");

        } else if (BMI >= 30) {
            System.out.println("Obesity");

        } else {
            System.out.println(" ");
            ;
        }


    }
}
