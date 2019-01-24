import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class MasterOrder here.
 *
 * @author Emily Wilber
 * @version Jan 22, 2019
 */
public class MasterOrder
{
    //The list of all cookie orders
    private List<CookieOrder> orders;
    
    /**
     * Constructs a new MasterOrder object.
     */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }

    /**
     * Adds theOrder to the master order.
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    /**
     * @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes()
    {
        int total = 0;
        for (CookieOrder order: orders) {
            total += order.getNumBoxes();
        }
        return total;
    }
    
    /**
     * Removes all cookie orders from the master order that have the same 
     * variety of cookie as cookieVar and returns the total number of boxes 
     * that were removed.
     * 
     * @param cookieVar the variety of cookies to remove from the master order
     * @return the total number of boxes of cookieVar in the cookie orders 
     *         removed
     */
    public int removeVariety(String cookieVar)
    {
       int numRemoved = 0;
       for (int i = 0; i <orders.size(); i++) {
           CookieOrder order = orders.get(i);
           if (order.getVariety().equals(cookieVar)) {
               numRemoved += order.getNumBoxes();
               orders.remove(i);
               i--;
           }
       }
       return numRemoved;
    }
    
    public void showOrder() {
        for(int i=0;i<orders.size();i++){
            System.out.println(orders.get(i));
        } 
        
    }
}
