public class NumberToWords {

    public static int reverse(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        // run loop until num becomes 0
        while (originalNumber != 0) {

            // get last digit from num
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;

            // remove the last digit from num
            originalNumber /= 10;

        }
        //System.out.println("Here is reversed number: " + reversed);
        return reversedNumber;

    }

    public static int getDigitCount(int number) {
        int digitPartial = number;
        int digitTotal = 0;

        if (number > 0) {
            // Count the number of digits in the number:
            while (digitPartial != 0) {
                digitPartial = digitPartial / 10;
                digitTotal++;

                //System.out.println("Here is value of digitPartial: " + digitPartial);
            }
           // System.out.println("Here is digitTotal: " + digitTotal);
            //return digitTotal;
        } else if (number == 0) {

            // System.out.println("Zero");
            return 1;
        } else if (number < 0) {
            return -1;
        }
        return digitTotal;
    }

    public static void numberToWords(int number) {
        String digitName = null;
        int choppedUpNumber = 0;
        int individualDigit = 0;
        // NumbersToWords.reverseNumber(number);
        //NumbersToWords.getDigitCount(number);
        //Use a for loop to march through each digit of reversed number:

        if (number > 0) {
            if (getDigitCount(number) > 0) {

                choppedUpNumber = NumberToWords.reverse(number);

                for (int i = 0; i < NumberToWords.getDigitCount(number); i++) {
                    //System.out.println("Here is value of i: " + i);
                    //Progressively isolate last digit if reversed number
                    //System.out.println("Here is individualDigit before division: " + individualDigit);
                    individualDigit = choppedUpNumber % 10;
                    //System.out.println("Here is individualDigit after division by 10: " + individualDigit);
                    switch (individualDigit) {
                        case 0:
                            digitName = "Zero";
                            System.out.println(digitName);
                            break;
                        case 1:
                            digitName = "One";
                            System.out.println(digitName);
                            break;
                        case 2:
                            digitName = "Two";
                            System.out.println(digitName);
                            break;
                        case 3:
                            digitName = "Three";
                            System.out.println(digitName);
                            break;
                        case 4:
                            digitName = "Four";
                            System.out.println(digitName);
                            break;
                        case 5:
                            digitName = "Five";
                            System.out.println(digitName);
                            break;
                        case 6:
                            digitName = "Six";
                            System.out.println(digitName);
                            break;
                        case 7:
                            digitName = "Seven";
                            System.out.println(digitName);
                            break;
                        case 8:
                            digitName = "Eight";
                            System.out.println(digitName);
                            break;
                        case 9:
                            digitName = "Nine";
                            System.out.println(digitName);
                            break;
                        default:
                            System.out.println("Here is default!");
                    }
                    choppedUpNumber = choppedUpNumber / 10;
                }
            }

        } else if (getDigitCount(number) == -1) {
            System.out.println("Invalid Value");
        } else if (getDigitCount(number) == 1) {
            System.out.println("Zero");
        }
    }
}

