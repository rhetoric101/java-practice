public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        int[] myIntArray = new int[]{ 13, 14, 15, 16, 17, 18, 19 };
        int i = 0;
        boolean outOfHere = false;
        while (i < 7) {
            if (myIntArray[i] == a || myIntArray[i] == b || myIntArray[i] == c) {
                outOfHere = true;
                i = 8;
            } else {
                outOfHere = false;
                i++;
            }
        }
        if (outOfHere == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int a) {
        int[] myIntArray = new int[]{ 13, 14, 15, 16, 17, 18, 19 };
        int i = 0;
        boolean outOfHere = false;
        while (i < 7) {
            if (myIntArray[i] == a) {
                outOfHere = true;
                i = 8;
            } else {
                outOfHere = false;
                i++;
            }
        }
        if (outOfHere == true) {
            return true;
        } else {
            return false;
        }
    }
}
