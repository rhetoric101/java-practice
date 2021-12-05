public class Main {
    public static void main (String[] args) {
        isEvenNumber(4);
        int number = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;

/*    while (number <= finishNumber){
        number ++;

        if (!isEvenNumber(number)) {
            continue;
       }
        System.out.println("Even number " + number);
    }

    }*/

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }
            if (totalEvenNumbers > 4) {
                break;
            }
            totalEvenNumbers++;
            System.out.println("Here is an even number " + number);

        }
        System.out.println("Total of even numbers: " + totalEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
