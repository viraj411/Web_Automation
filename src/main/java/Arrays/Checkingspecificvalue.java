package Arrays;

public class Checkingspecificvalue {

    public static void main(String[] args) {
        int[] arr = {11, 54, 657, 878, 232, 545};

        int target = 54;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) {

                System.out.println(target+ "value is Present");

            }

        System.out.println("not present");

        }
    }



