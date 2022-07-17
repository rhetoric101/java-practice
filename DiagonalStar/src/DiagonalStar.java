public class DiagonalStar {

    public static void printSquareStar(int number){
        if( number < 5) {
            System.out.println("Invalid Value");
            return;
        } else {
            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if (row == 1 || row == number || col == 1 || col == number) {
                        System.out.print("*");
                    } else if (row == col) {
                        System.out.print("*");
                    } else if (col == (number - row + 1)) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }// close inner loop
                System.out.println();

            }// close outer loop
        }
    }
}
//I struggled with this and had to rely on Tim's example!
//All I did was fix his error message and then add an else statement.
//I didn't have the juice to figure out the logic of the stars!
