package Robot;
import java.util.Arrays;

/**
 * Robot picks up toys (and other items) in a tiled hallway. Each tile is an
 * element in an array. He does moves until he has picked up all the items.
 *
 * @author Emily Wilber
 * @version 6 Dec, 2018
 */
public class Robot
{
    private int[] hall;
    private int pos;        // current position(tile number) of Robot
    private boolean facingRight;    //true means this Robot is facing right
    
    /**
     * Constructor for Robot, makes hall, pos, and facingRight accessible
     */
    public Robot(int[] hall, int pos, boolean facingRight) {
        this.hall = hall;
        this.pos = pos;
        this.facingRight = facingRight;
    }
    
    /**
     * poscondition:    returns true if this Robot has a wall imediately in 
     *                  front of it, so that it cannot move foreward;
     *                  otherwise, returns false
     */
    private boolean forwardMoveBlocked()
    {
        if (facingRight) {
            if (pos == hall.length - 1) {
                return true;
            }
            return false;
        }
        else {
            if (pos == 0) {
                return true;
            }
            return false;
        }
    }

    /**
     * poscondition:    one move has been made according to the specifications
     *                  above and the state of this Robot has been updated
     */
    private void move()
    {
        if (hall[pos] > 0) {
            hall[pos]--;
        }
        if (hall[pos] == 0) {
            if (forwardMoveBlocked()) {
                facingRight = !facingRight;
            }
            else {
                if (facingRight) {
                    pos++;
                }
                else {
                    pos--;
                }
            }
        }
        
    }
    
    
    /**
     * poscondition:    no more items remain in the hallwayl
     * @return          returns the number of moves made
     */
    public int clearHall()
    {
        int moveTotal = 0;
        while (!hallIsClear()) {
            move();
            moveTotal++;
        }
        return moveTotal;
    }
    
    /**
     * @retrun  true if the hallway contains no items;
     *          otherwise, returns false;
     */
    private boolean hallIsClear() 
    {
        int itemsLeft = 0;
        for (int i = 0; i < hall.length; i++) {
            itemsLeft += hall[i];
        }
        
        if (itemsLeft == 0) {
            return true;
        }
        return false;
        
    }
    
}
