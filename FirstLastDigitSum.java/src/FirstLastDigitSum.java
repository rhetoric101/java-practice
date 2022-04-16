public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int firstDigit;
        int lastDigit;
        int sumOfDigits = 0;
        int divisor;
        int digitCount;
        int totalDigits = 0;
        int tempNumber = 0;

        if (number < 0) {
            System.out.println("Sorry, the number needs to be positive!");
            return -1;
        } else if (number == 0) {
            System.out.println("You entered zero, so the value is 0!");
            return -0;
        } else {


            //find last digit

            lastDigit = number % 10;

            //find total digits

            tempNumber = number;
            digitCount = 0;
            while (tempNumber != 0) {
                digitCount++;
                tempNumber = tempNumber / 10;
                totalDigits = digitCount;
        }

            // calculate value of a divisor to isolate the first digit

            divisor = (int) Math.pow(10, totalDigits - 1);

            // find the first digit

            firstDigit = number / divisor;

            // calculate total of first and last digits:

            sumOfDigits = firstDigit + lastDigit;

            System.out.println("The sum of first & last"
                    + " digit of the number " + number
                    + " = " + sumOfDigits);

            return sumOfDigits;

        }

    }

}

