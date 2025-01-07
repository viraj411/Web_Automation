package JavaPrograming;

import java.util.Scanner;

public class Swtich_case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        String dayname = "";

        if (day < 1 || day > 7) {
            System.out.println("enter the valid day");

        }
        switch (day) {
            case 1:
                dayname="Monday";
                break;

            case 2:
                dayname="Tuesday";
                break;
            case 3:
                dayname= "Wednesday";
            default:

        }
        System.out.println(dayname);
    }
}