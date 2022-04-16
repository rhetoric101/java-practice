public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        int integerTest = 0;
        int firstNumberFinalDigit;
        int secondNumberFinalDigit;
        int thirdNumberFinalDigit;
        int[] myBigArray = {firstNumber, secondNumber, thirdNumber};

        for (int i = 0; i < 3; i++) {

            integerTest = myBigArray[i];
            if (isValid(integerTest)) {
              //  System.out.println("This works!");
               //Insert stuff here to test for digits
              firstNumberFinalDigit = firstNumber % 10;
              secondNumberFinalDigit = secondNumber % 10;
              thirdNumberFinalDigit = thirdNumber % 10;
                System.out.println("First: " + firstNumberFinalDigit + "Second: " + secondNumberFinalDigit + "Third: " + thirdNumberFinalDigit);

              if (firstNumberFinalDigit == secondNumberFinalDigit ||
                  firstNumberFinalDigit == thirdNumberFinalDigit ||
                  secondNumberFinalDigit == thirdNumberFinalDigit) {
                  System.out.println("Yes, these numbers share a common final digit!");
                  return true;
              } else {
                  System.out.println("Sorry, but these don't share a common digit!");
                  return false;
              }

            } else {
                return false;
            }

        }

        return true;

    }

    public static boolean isValid(int integerTest) {

        if (integerTest >= 10 && integerTest <= 1000) {
            return true;
        } else {
            System.out.println("So, sorry. You need a number between 10 and 1000!");
            return false;
        }
    }
}
