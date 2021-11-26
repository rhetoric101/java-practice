public class Main {
    public static void main(String[] args) {
            calculateInterest(10000);
            //The instructor did the for loop in main and used the literal values of the counter as the percentage like this:
            //calculateInterest(10000.0, i)
            //This allowed him to avoid using an array!!
            //Also, if you want to go in reverse through a for loop, just do this: for(int i=8; i>=2; i--)

    }
    public static double calculateInterest(double amount) {
        double[] percentArray = new double[]{ .02,.03,.04,.05,.06,.07,.08 };

        for (int i=0; i < 7; i++) {
            System.out.println(amount + " at " + percentArray[i] + " equals " + String.format("%.2f", (amount * (percentArray[i]))));
        }
        return amount;
    }
}

