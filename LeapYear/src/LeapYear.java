import java.time.Year;

public class LeapYear {
    public static boolean isLeapYear (int year) {
        boolean divisibleByFour = year % 4 == 0;
        boolean divisibleByHundred = year % 100 == 0;
        boolean divisibleByFourHundred = year % 400 == 0;
        boolean myReturnValue = false;

        if ((year >= 1) && (year <= 9999)){
            if (divisibleByFour && !divisibleByHundred) {
                myReturnValue = true;
                System.out.println("Yes, this is a leap year: " + year);
            } else if (divisibleByFour && divisibleByHundred && divisibleByFourHundred) {
                myReturnValue = true;
                System.out.println("Yes, this is a leap year: " + year);
            } else {
                myReturnValue = false;
                System.out.println("Sorry, buster! Not a leap year!");
            }
        } else {
            System.out.println("Your date is out of range!");
            myReturnValue = false;
        } return myReturnValue;
    }

}
