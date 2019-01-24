import java.util.ArrayList;
import java.util.List;
/**
 * Cookie Orders.
 *
 * @author Emily Wilber
 * @version Jan 22, 2019
 */
public class CookieOrder
{
    private String variety;
    private int numBoxes;
    
    /**
     * Constructs a new CookieOrder object
     */
    public CookieOrder(String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    /**
     * @return the varuety of cookie being ordered
     */
    public String getVariety()
    {
        return variety;
    }
    
    /**
     * @return the varuety of cookie being ordered
     */
    public int getNumBoxes()
    {
        return numBoxes;
    }
    
    public String toString()
    {
          return variety + " " + numBoxes;
    }
}
