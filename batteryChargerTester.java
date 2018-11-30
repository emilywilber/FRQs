 

/**
 * Tests the battery charger
 *
 * @author Emily Wilber
 * @version November 1, 2018
 */
public class batteryChargerTester
{
    public static void main(String[] args)
    {
        int[] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 
                           150, 150, 150, 200, 40, 240, 220, 220, 
                           200, 200, 180, 180, 140, 100, 80, 60};
                
        batteryCharger BC = new batteryCharger(rateTable);
        
        
        System.out.println(BC.getChargingCost(12, 1));
        System.out.println(BC.getChargingCost(0, 2));
        System.out.println(BC.getChargingCost(22, 7));
        System.out.println(BC.getChargingCost(22, 30));
        System.out.println("\n");
        System.out.println(BC.getChargeStartTime(1));
        System.out.println(BC.getChargeStartTime(2));
        System.out.println(BC.getChargeStartTime(7));
        System.out.println(BC.getChargeStartTime(30));
        System.out.println("--------\n");
    }
}