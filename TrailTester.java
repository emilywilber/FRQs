
/**
 *Tests the methods from Trail.
 *
 * @author Emily Wilber
 * @version November 16, 2018
 */
public class TrailTester
{
    /**
     * Prints the results of the tests of the isLevelTrailSegment and isDifficult 
     * methods.
     */
    public static void main(String[] args)
    {
        int[] markers1 = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        int[] markers2 = {10, 1000, 90, 80};
        int[] markers3 = {10, 1000, 10, 1000};
        
        Trail t1 = new Trail(markers1);
        System.out.println("isLevelTrailSegment(7, 10) should be true: "  + t1.isLevelTrailSegment(7, 10));
        System.out.println("isLevelTrailSegment(2, 12) should be false: " + t1.isLevelTrailSegment(2, 12));
        System.out.println("isLevelTrailSegment(0, 1) should be false: " + t1.isLevelTrailSegment(0, 1));
        System.out.println();
        
        System.out.println("isDifficult should be true: " + t1.isDifficult());
        Trail t2 = new Trail(markers2);
        System.out.println("isDifficult should be false: " + t2.isDifficult());
        Trail t3 = new Trail(markers3);
        System.out.println("isDifficult should be true: " + t3.isDifficult());
        
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
    }
}
