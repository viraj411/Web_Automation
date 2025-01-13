package Strings;

public class Removediplicate {

        public static void main(String[] args) {
            String input = "mississippi";
            String result = "";

            for (int i = 0; i < input.length(); i++) {
                if (result.indexOf(input.charAt(i)) == -1) {
                    result += input.charAt(i);
                }
            }

            System.out.println("Original: " + input);
            System.out.println("Without duplicates: " + result);


            String str = "2345678 ";
          //  String[] words = str.trim().split("\\s+");
          //  System.out.println("Word count: " + words.length);

            boolean isonlydigit=str.matches("\\d+");

            if (isonlydigit){
                System.out.println("Contains digit");
            }
            else{
                System.out.println("Non digit ");
            }
        }
    }



