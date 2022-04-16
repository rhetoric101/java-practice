public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int total = 0;

        if (number < 0) {
            System.out.println("Sorry, but you need to use a positive number!");
            return -1;
        } else if (number >= 0) {

            while (number != 0) {
                int even = number % 10;

                if (even % 2 == 0) {
                    total += even;
                }

                number = number / 10;
            }

            System.out.println("Here is the sum of even digits: " + total);
        }

        return total;
    }
}