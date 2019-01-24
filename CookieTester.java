import java.util.ArrayList;
import java.util.List;
/**
 * Tests MasterOrder
 *
 * @author Emily Wilber
 * @version Jan 22, 2019
 */
public class CookieTester
{
    public static void main (String[] args)
    {
        CookieOrder C1 = new CookieOrder("Chocolate Chip", 1);
        CookieOrder C2 = new CookieOrder("Shortbread", 5);
        CookieOrder C3 = new CookieOrder("Macaroon", 2);
        CookieOrder C4 = new CookieOrder("Chocolate Chip", 3);
        
        MasterOrder M1 = new MasterOrder();
        M1.addOrder(C1); 
        M1.addOrder(C2); 
        M1.addOrder(C3); 
        M1.addOrder(C4);  
        
        M1.showOrder();
        System.out.println();
       
        System.out.println("Total boxes: " + M1.getTotalBoxes());
        System.out.println("Number of chocolate chips removed: " + M1.removeVariety("Chocolate Chip"));
        System.out.println("Total boxes: " + M1.getTotalBoxes());
        System.out.println();
        
        M1.showOrder();
        System.out.println();
        
        System.out.println("Number of brownies removed: " + M1.removeVariety("Brownie"));
        System.out.println();
        
        M1.showOrder();
        
    }
}
