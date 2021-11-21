public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int myDivisor = 1024;
            int myQuotient = kiloBytes / myDivisor;
            int myModulus = kiloBytes % myDivisor;
            System.out.println(kiloBytes + " KB" + " = " + myQuotient + " MB and " + myModulus + " KB");
        }
    }
}
