//This is an overloading exercise where you pass in inches which gets converted to centimeters
// but it involves an intermediate conversion to feet and inches! Not too common!

public class Main {
    public static void main(String[] args) {
        // double conversionResults = FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(2, 6);
        // System.out.println("Here is feet and inches in centimeters: " + conversionResults);

        double conversionResultsInches = FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(157);
        System.out.println("Here is inches to centimeters: " + conversionResultsInches);

    }
}
