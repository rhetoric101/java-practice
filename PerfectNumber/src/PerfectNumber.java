public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number >= 1) {
            for(int i = 1 ; i < number ; i++) {
                if(number % i == 0)  {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a Perfect Number");
            return true;
            } else {
                System.out.println(number + " is NOT a Perfect Number");
            return false;
            }
        } else {
            System.out.println("Sorry, but the number needs to be greater than zero!");
        }
    return false;
    }

}
