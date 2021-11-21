public class Main {
    public static void main(String[] args) {
        Boolean isTheSame = DecimalComparator.areEqualByThreeDecimalPlaces(3.1758, 3.175);
        if (isTheSame) {
            System.out.println("The values are the same!");
        } else {
            System.out.println("The values are different!");
        }
    }
}
