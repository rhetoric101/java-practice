public class LargestPrime {
//I got ideas from this example: https://javarevisited.blogspot.com/2015/03/how-to-find-largest-prime-factor-of.html#axzz7RPag7oUA
    public static int getLargestPrime(int number) {
        int i;
        int copyOfInput = number;

        System.out.println("Here is initial copyOfInput: " + copyOfInput);

        if (number > 1) {
            for (i = 2; i <= copyOfInput; i++) {
                System.out.println("Here is increment of i: " + i);
                if (copyOfInput % i == 0) {
                    copyOfInput /= i;
                    System.out.println("Here is copyOfInput: " + copyOfInput);
                    i--; //I don't know what this does!!
                    System.out.println("Here is i after decrement: " + i);
                }
            }
            System.out.println("Here is i next to return: " + i);
            return i;
        } else {
            System.out.println("The number needs to be greater that 1!");
            return -1;
        }
    }
}
