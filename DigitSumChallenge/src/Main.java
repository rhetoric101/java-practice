public class Main {
    public static void main(String[] args) {
        sumDigits(15);
    }

    public static int sumDigits(int number) {
        if (number <= 10) {
            System.out.println("Sorry, that was an invalid value!");
            return -1;
        } else {
            int someNewNumber = 0;
            int totalOfDigits = 0;
            while (number > 0) {
                // 123 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5 (Instructor's logic--not mine)
                // digit = number % 10;
                // sum += digit;
                someNewNumber = (number % 10);
                System.out.println("Here is early someNewNumber: " + someNewNumber);
                totalOfDigits += someNewNumber;
                number = number / 10; // or use this shortcut:  number /= 10;
            }
            System.out.println("Here is the total: " + totalOfDigits);
            return number;
        }
    }
}
