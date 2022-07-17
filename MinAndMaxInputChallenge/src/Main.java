import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        // you can also set min and max to ginormous values to ensure user input is not trumped by your initialization.
        // int min = -2147483647
        // int max = 2147483647;
        // or use constants inside Integer wrapper class.
        //int min = Integer.MAX_VALUE;
        //int min = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                    System.out.println("Here are subsequent mins: " + min);

                }

            } else {
                break;
            }

            scanner.nextLine(); //handle input

        }
        System.out.println("min= " + min + ", max= " + max);
        scanner.close();

    }
}
