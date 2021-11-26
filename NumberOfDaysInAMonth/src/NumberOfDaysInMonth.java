public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
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
    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            int days = 28;
            boolean myBigDecision = isLeapYear(year);
            if (myBigDecision)
                days = 29;
                switch(month) {
                    case 1:
                        days = 31;
                        System.out.println("January " + year + " has " + days + " days");
                        break;
                    case 2:

                        System.out.println("February  " + year + " has " + days + " days");
                        break;
                    case 3:
                        days = 31;
                        System.out.println("March " + year + " has " + days + " days");
                        break;
                    case 4:
                        days = 30;
                        System.out.println("April " + year + " has " + days + " days");
                        break;
                    case 5:
                        days = 31;
                        System.out.println("May " + year + " has " + days + " days");
                        break;
                    case 6:
                        days = 30;
                        System.out.println("June " + year + " has " + days + " days");
                        break;
                    case 7:
                        days = 31;
                        System.out.println("July " + year + " has " + days + " days");
                        break;
                    case 8:
                        days = 31;
                        System.out.println("August " + year + " has " + days + " days");
                        break;
                    case 9:
                        days = 30;
                        System.out.println("September " + year +  " has" + days + " days");
                        break;
                    case 10:
                        days = 31;
                        System.out.println("October " + year + " has " + days + " days");
                        break;
                    case 11:
                        days = 30;
                        System.out.println("November " + year + " has " + days + " days");
                        break;
                    case 12:
                        days = 31;
                        System.out.println("December " + year + " has " + days + " days");
                        break;
                }
                return days;
        }
    }
}

