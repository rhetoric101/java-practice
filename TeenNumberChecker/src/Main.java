public class Main {
    public static void main(String[] args) {
        Boolean containsATeen = TeenNumberChecker.hasTeen(15, 45, 50);
        if (containsATeen) {
            System.out.println("Yes, containsATeen has a number here!");
        } else {
                System.out.println("Sorry, containsATeen does not have a number here!");
        }

        Boolean containsATeenAlso = TeenNumberChecker.isTeen(45);
        if (containsATeenAlso) {
            System.out.println("Yes, isTeen has a number here!");
        } else {
            System.out.println("Sorry, isTeen does not have a teen number here!");
        }

     }
}


