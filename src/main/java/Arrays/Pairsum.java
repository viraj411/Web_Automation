package Arrays;

public class Pairsum {


    public static void main(String[] args) {
        // Example array and target sum
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetSum = 10;

        System.out.println("Pairs whose sum is equal to " + targetSum + ":");

        // Find all pairs whose sum is equal to targetSum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                }
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    // System.out.println(numbers[i] +"" + numbers[j]);
                    System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                    

                }
            }
        }
    }
}

//            }
//        }}}
//
//
