public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int myInitialAbsoluteNumber = Math.abs(number);
        int myAbsoluteNumber = Math.abs(number);
        int remainder, temp;
        int sum = 0;
        temp = myInitialAbsoluteNumber;

        if (myInitialAbsoluteNumber > 9) {

            while (myAbsoluteNumber > 0) {
                // System.out.println("Here is myAbsoluteNumber " + myAbsoluteNumber);

                remainder = myAbsoluteNumber % 10;  //calculate the remainder
                // System.out.println("Value of r " + r);
                sum = (sum * 10) + remainder;
                myAbsoluteNumber = myAbsoluteNumber / 10;
            }
            if (temp == sum) {
                System.out.println("Yes, this is a palindrome number!");
                return true;
            } else {
                System.out.println("Nope, this is not a palindrome number.");
                return false;
            }

        } else {
            System.out.println("Sorry, you need to submit a two-digit number!");
            return false;
        }

    }
}