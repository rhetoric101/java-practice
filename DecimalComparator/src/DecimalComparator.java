public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        a=a* (Math.pow(10, 3));
        b=b* (Math.pow(10, 3));
        int myIntegerA = (int)a;
        int myIntegerB = (int)b;

        if (myIntegerA == myIntegerB){
            return true;
        } else {
            return false;
        }
    }
}
