public class Test2   {

    public static void main(String[] args) {

                try {
                    System.out.println("Inside try block");
                    int result = 10 / 3;  // This will throw ArithmeticException
                }  catch (ArithmeticException e) {
                    System.out.println("Caught ArithmeticException: " +e.getMessage());
                } finally {
                    System.out.println("This is the finally block, it runs no matter what.");
                }
            }
        }



