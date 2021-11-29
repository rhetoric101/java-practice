public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd( int start, int end) {
        int total = 0;
        if (((start < 1) || (end < 1)) || (end < start)) {
            System.out.println("Sorry, your range is not valid!");
            return -1;
        } else {

            for(int i=start; i <= end; i++) {
                boolean isItOdd = SumOddRange.isOdd(i);
                if (isItOdd) {
                    total += i;
                }
                System.out.println("Here is the sum" + total);
            }
        }
        return total;
    }
}
