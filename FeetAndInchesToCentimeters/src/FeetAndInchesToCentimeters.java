public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Oops, either your inches or feet are not in range!");
            return -1;
        } else {
            double feetAsInches = feet * 12;
            double totalInches = feetAsInches + inches;
            double totalCentimeters = totalInches * 2.54;
            return totalCentimeters;
            /* The instructor did this, which is more compact:
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
             */
        }
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        double returnResults = 0;
        if (inches < 0) {
            System.out.println("Oops, your inches value is not in range!");
            return -1;
        } else {
            int totalFeetFromInches = inches / 12;
            double totalFeetFromInchesDouble = (double) totalFeetFromInches;
            int totalRemainingInches = inches % 12;
            returnResults = calcFeetAndInchesToCentimeters(totalFeetFromInches, totalRemainingInches);
            return returnResults;
            /* The instructor did this, passing in (double inches):
            double feet = (int) inches / 12; // I didn't know you could cast like this!
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches); // Pretty slick simplification!!
             */
        }
    }
}
