public class FlourPacker {
    //I borrowed this from Tim's GitHub page, but I added console messages...
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bigCount *= 5;
        if (smallCount + bigCount >= goal) {
            if (smallCount + bigCount == goal) { //Exact match
                System.out.println("This is an exact match!");
                return true;
            }else if(bigCount > goal) {
                if (smallCount >= goal || bigCount % goal == 0 || goal % 5 <= smallCount) { //Use EITHER big or small bags
                    System.out.println("You have enough flour, so you could use either small or large bags!");
                    return true;
                }
            }else{
                //bigCount < goal ::: Small count + bigCount > goal, then divide small bags evenly to achieve the goal.
                System.out.println("You have plenty of flour from each type, so you could divide it up evenly.");
                return true;
            }
        }
        System.out.println("Sorry, but there isn't enough flour to meet this order!");
        return false;
    }
}

