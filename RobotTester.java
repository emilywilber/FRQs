package Robot;
import java.util.Arrays;

/**
 * 
 * Tests that the robot can pick up toys.
 *
 * @author Emily Wilber
 * @version 6 Dec, 2018
 */
public class RobotTester
{
    /**
     * tests robot
     */
    public static void main(String[] args)
    {
        int[] hall1 = {1, 1, 2, 2};
        int pos1 = 1;
        boolean facingRight1 = true;
        
        Robot lilBoi = new Robot(hall1, pos1, facingRight1); 
        
        System.out.println(Arrays.toString(hall1));
        System.out.println("Moves count: " + lilBoi.clearHall());
        System.out.println(Arrays.toString(hall1));
        System.out.println();
        
        int[] hall2 = {2, 0, 1, 0};
        int pos2 = 0;
        boolean facingRight2 = true;
        
        Robot lilGorl = new Robot(hall2, pos2, facingRight2); 
        
        System.out.println(Arrays.toString(hall2));
        System.out.println("Moves count: " + lilGorl.clearHall());
        System.out.println(Arrays.toString(hall2));
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
    }

}
