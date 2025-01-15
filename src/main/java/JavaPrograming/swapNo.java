package JavaPrograming;

public  class swapNo {

        public static void main(String[] args) {
            int a = 12;
            int b = 15;

            // Swapping using arithmetic operations
            a = a + b; // Step 1: a becomes the sum of a and b  27
            b = a - b; // Step 2: b becomes the original value of a 12
            a = a - b; // Step 3: a becomes the original value of b  15

            System.out.println("a: " + a); // Should print 15
            System.out.println("b: " + b); // Should print 12

            I
            Step 1	a = a + b	27	15
            Step 2	b = a - b	27	12
            Step 3	a = a - b	15	12
        }
    }




