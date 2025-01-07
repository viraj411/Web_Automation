package JavaPrograming;

import java.util.Scanner;

public class ReverseString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input string from user
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            // Initialize an empty string to store the reversed string
            String reversed = "";

            // Reverse the string using a for loop
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);  // Append each character in reverse order
            }
            System.out.println("Reversed string: " + reversed);

            // Output the reversed string
        }
    }






