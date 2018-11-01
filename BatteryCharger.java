
/**
 * Write a description of class BatteryCharger here.
 *
 * @author Emily Wilber
 * @version Nov 1, 2018
 */
public class BatteryCharger
{
    private int[] rateTable = new int[]{50, 60, 160, 60, 80, 100, 100, 120, 
        150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 
        80, 60};
    /**
     * Determines the total cost to charge the battery starting at
     * the beginning of startHour.
     * @param startHour   the hour at which the charge period begins
     *          Precondition: 0 <= startHour <= 23
     * @param chargeTime  the number of hours the battery needs to be charged
     *          Precondition: chargeTime > 0
     * @return            the total cost to charge the battery
     */
    public int getChargingCost(int startHour, int chargeTime)
    {
        int sum = 0;
        for (int i = 0; i <chargeTime; i++) {
            sum += rateTable[i%24];
        }
        return sum;
    }
    

    /**
     * Constructor for objects of class BatteryCharger
     */
    public BatteryCharger()
    {
        
    }
    
    /**
     * 
     */
    public void tester( )
    {
        batteryCharger BC = new batteryCharger;
        System.out.println(BC.getChargingCost(0, 1));
    }
}
