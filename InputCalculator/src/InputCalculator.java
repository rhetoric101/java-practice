import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        double numberAsDouble = 0;
        double average  = 0;
        // System.out.println("INPUT: ");
        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                sum += scanner.nextInt();

                i++;
                numberAsDouble = sum;
                average = numberAsDouble / i;
                //System.out.println("SUM = " + sum);
                scanner.nextLine(); //handle input
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }

        }

    }
}

//Holy cow! It took me hours to figure out that I wasn't supposed to print out the headings in the example!
//Also, the instructions weren't very clear about how needed to do the math on doubles and
//then use round on the results, which casts to LONG! OUCH! I flailed on this for hours!!