public class Main {
    public static void main (String[] args) {
        boolean myResults = PlayingCat.isCatPlaying(false, 35);
        if (myResults) {
            System.out.println("The cats are playing");
        } else {
            System.out.println("The cats are NOT playing");
        }
    }
}
