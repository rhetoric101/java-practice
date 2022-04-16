public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
            int firstNumberLastDigit;
            int secondNumberLastDigit;
            int firstNumberFirstDigit;
            int secondNumberFirstDigit;
            int originalFirstNumber;
            int originalSecondNumber;

        originalFirstNumber = firstNumber;
        originalSecondNumber = secondNumber;

        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            firstNumberLastDigit = firstNumber % 10;
            secondNumberLastDigit = secondNumber % 10;

            firstNumber /= 10;
            secondNumber /= 10;

            firstNumberFirstDigit = firstNumber;
            secondNumberFirstDigit = secondNumber;



            if (firstNumberLastDigit == secondNumberLastDigit || firstNumberLastDigit == secondNumberFirstDigit) {
                System.out.println("Yes, " + originalFirstNumber + " and " + originalSecondNumber + " have a common digit!");
                return true;

            } else if (firstNumberFirstDigit == secondNumberFirstDigit || firstNumberFirstDigit == secondNumberLastDigit) {
                System.out.println("Yes, " + originalFirstNumber + " and " + originalSecondNumber + " have a common digit!");
                return true;
            } else {

                System.out.println("Invalid input.");
            }
        } return false;
    }
}
