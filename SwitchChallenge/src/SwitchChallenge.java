public class SwitchChallenge {
    public static void myFirstSwitch(char charValue, String month) {
        //char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("Value is a");
                break;
            case 'B':
                System.out.println("Value is b");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found ");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }
        //String month = "June";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("jun");
                break;
            default:
                System.out.println("Not sure!");
        }
    }
}
