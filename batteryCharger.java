/**
 * An electric car runs on betteries and must be periodically recharged for 
 * a certain number of hours. Methods will determine total cost to charge
 * using a start and charge time and will find the most efficient time to start.
 *
 * @author Emily Wilber
 * @version Nov 1, 2018
 */
public class batteryCharger
{
    private int[] rateTable;
    
    /**
     * Allows array rateTable to be accessable 
     * @param rateTable   the private array of cost per each hour
     */
    public batteryCharger(int[] rateTable) {
         this.rateTable = rateTable;
    }
    
    /**
     * Determines the total cost to charge the battery starting at
     * the beginning of startHour.
     * @param startHour   the hour at which the charge period begins
     *          Precondition: 0 <= startHour <= 23
     * @param chargeTime  the number of hours the battery needs to be charged
     *          Precondition: chargeTime > 0
     * @return            the total cost to charge the battery
     */
    private int getChargingCost(int startHour, int chargeTime)
    {
        int sum = 0;
        for (int i = startHour; i < startHour + chargeTime; i++) {
            sum += rateTable[i%24];
        }
        return sum;
    }
    

    /** 
     * Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime  the number of hours the battery needs to be charges
     *              Precondition: chargeTime > 0
     * @return an optimal start time, with 0 <= returned value <= 23
     */
    public int getChargeStartTime(int chargeTime)
    {
        int smallestCost = getChargingCost(0, chargeTime);
        int optimalTime = 0;
        for (int startTime = 0; startTime < 24; startTime++) {
            if (getChargingCost(startTime, chargeTime) < smallestCost) {
                smallestCost = getChargingCost(startTime, chargeTime);
                optimalTime = startTime;
            }   
        }
        return optimalTime;
    }
    
    
}