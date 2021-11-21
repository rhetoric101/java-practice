public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long numberOfYears = minutes / 525600;
            String yearsString = numberOfYears + " y ";
            long numberOfDays = minutes % 525600 / 1440;
            String daysString = numberOfDays + " d ";
            System.out.println(minutes + " min = " + yearsString  + "and " + daysString);
        }
    }
}