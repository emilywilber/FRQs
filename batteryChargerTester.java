/**
 * Tests the battery charger
 *
 * @author Emily Wilber
 * @version November 1, 2018
 */
public class tester
{
    public static void tester( )
    {
        batteryCharger BC = new batteryCharger();
       
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