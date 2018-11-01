
/**
 * Write a description of class oddRight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class oddRight
{
    /**
     * Constructor for objects of class oddRight
     */
    public static boolean oddRight(int n)
    {
        int digit = 0;
        boolean haveseeneven = false;
        
        while (n > 0)  {
            digit = n % 10;
            if ((digit % 2) == 1)  {
                if (haveseeneven)  {
                    return false;
                }
            }
            else {
                haveseeneven = true;
            }
            n = n / 10;
        }
        return true;
    }
    
    public static void test(){
        System.out.println("12: " + oddRight(12));
        System.out.println("21: " + oddRight(21));
        System.out.println("1112: " + oddRight(1112));
        System.out.println("2111: " + oddRight(2111));
        System.out.println("213572: " + oddRight(213572));
    }
    }
    

   
