public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 12; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number!");
                if(count == 3) {
                    System.out.println("Exiting for loop!");
                    break;
                }
            } else {
                System.out.println(i + " is NOT a prime number");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            // the instructor says instead of n/2 you can use square root for faster code:
            // for(int i=2; i <= (long) Math.sqrt(n); i++)
            // This means you have to check fewer numbers!
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

