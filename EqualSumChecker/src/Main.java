public class Main {
    public static void main(String[] args) {
        Boolean theBigSum = EqualSumChecker.hasEqualSum(1,2,2);
        if (theBigSum) {
            System.out.println("The sum of the first two equals the third!");
        } else {
            System.out.println("Sorry, the sum of the first two does NOT equal the third!");
        }
    }
}
