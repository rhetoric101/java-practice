public class SecondsAndMinutesChallenge {
     public static final String INVALID_VALUE_MESSAGE = "Invalid value";
     public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds > 59 || seconds < 0)) {
            return INVALID_VALUE_MESSAGE;
        }
        long numberOfHours = minutes / 60;
        minutes =+ minutes % 60;

        //Bonus section for hours, minutes, or seconds less than 10:
         String hoursString = numberOfHours + "h";
         if (numberOfHours < 10) {
             hoursString = "0" + hoursString;
         }
         String minutesString = minutes + "m";
         if (minutes < 10) {
             minutesString = "0" + minutesString;
         }
         String secondsString = seconds + "s";
         if (seconds < 10) {
             secondsString = "0" + secondsString;
         }

        return hoursString  + " " + minutesString + " " + secondsString + "s";

     }
    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
