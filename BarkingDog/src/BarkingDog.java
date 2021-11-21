public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(barking == true && (hourOfDay > -1 && hourOfDay < 8)) {
            return true;
        } else if(barking == true && (hourOfDay > 22 && hourOfDay < 24)) {
            return true;
        } else if ((barking == true || barking == false) && hourOfDay < 0) {
            return false;
        } else {
            return false;
        }

    }
}

