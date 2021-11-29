public class Main {
    public static void main (String[] args) {
        int total = 0;
        int count = 0;
        for (int i=1; i < 1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " is divisible by 3 and 5");
                total += i;
                count++;
            }
            if (count > 4) {
                break;
            }
        }
        System.out.println("Here is the total: " + total);
    }
}
