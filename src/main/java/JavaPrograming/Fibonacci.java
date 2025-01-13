package JavaPrograming;

public class Fibonacci {

        public static void main(String[] args) {
            int n = 10; // Example to find the 10th Fibonacci number
            int a = 0, b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
        }
    }
