public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {

       int greatestCommonDivisor = 1;

       if (firstNumber >= 10 && secondNumber >= 10) {

           for(int i = 1; i <= firstNumber && i <= secondNumber; i++)
           {
               if(firstNumber%i==0 && secondNumber%i==0)
                   greatestCommonDivisor = i;
           }
           System.out.println("Here is the greatest common divisor: " + greatestCommonDivisor);
       return greatestCommonDivisor;
       } else {
           System.out.println("Sorry, but each number needs to be larger than 10!");
           return -1;
       }

    }

}
