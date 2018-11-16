
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
        Trail t1 = new Trail();
        
        System.out.println("isLevelTrailSegment(7, 10) should be true: "  + t1.isLevelTrailSegment(7, 10));
        System.out.println("isLevelTrailSegment(2, 12) should be false: " + t1.isLevelTrailSegment(2, 12));
        System.out.println("isLevelTrailSegment(0, 1) should be false: " + t1.isLevelTrailSegment(0, 1));
        System.out.println();
        
        System.out.println("isDifficult should be true: " + t1.isDifficult());
        //System.out.println("isDifficult should be false: " + t1.isDifficult());
        //System.out.println("isDifficult should be true: " + t1.isDifficult());
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
    }
}
