import java.sql.SQLOutput;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            System.out.println("Sorry, you can't enter a value less than 1");
            return -1;
        } else {
            double wallArea = 0;
            double totalBuckets = 0;
            double totalToBuy = 0;

            wallArea = width * height;
            totalBuckets = wallArea / areaPerBucket;
            totalToBuy = totalBuckets - extraBuckets;
            if (totalToBuy < 0) {
                return 0;
            } else {

                System.out.println("Here's what you need to buy: " + ((int) Math.ceil(totalToBuy)));
                return ((int) Math.ceil(totalToBuy));
            }
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            System.out.println("Sorry, you can't enter a value less than 1");
            return -1;
        } else {
        double wallArea = 0;
        double totalBuckets = 0;
        double totalToBuy = 0;
        int extraBuckets = 0;

        wallArea = width * height;
        totalBuckets = wallArea / areaPerBucket;
        totalToBuy = totalBuckets - extraBuckets;
        if (totalToBuy < 0) {
            return 0;
        } else {

            System.out.println("Here's what you need to buy: " + ((int) Math.ceil(totalToBuy)));
            return ((int) Math.ceil(totalToBuy));
        }
      }

    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            System.out.println("Sorry, you can't enter a value less than zero");
            return -1;
        } else {
            double totalBuckets = 0;
            double totalToBuy = 0;
            int extraBuckets = 0;

            totalBuckets = area / areaPerBucket;
            totalToBuy = totalBuckets - extraBuckets;
            if (totalToBuy < 0) {
                return 0;
            } else {

                System.out.println("Here's what you need to buy: " + ((int) Math.ceil(totalToBuy)));
                return ((int) Math.ceil(totalToBuy));
            }
        }
    }
}
