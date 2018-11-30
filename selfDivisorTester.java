package selfDivisor;


/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Arrays;

public class Tester
{
 

    /**
     * Constructor for objects of class Tester
     */
    public static void Tester()
    {
        SelfDivisor SD = new SelfDivisor();
        int[] result = new int[4];
        System.out.println("SD.isSelfDivisor(128) " + SD.isSelfDivisor(128));
        System.out.println("SD.isSelfDivisor(26) " + SD.isSelfDivisor(26));
        System.out.println("SD.isSelfDivisor(10) " + SD.isSelfDivisor(10));
        System.out.println("SD.isSelfDivisor(2) " + SD.isSelfDivisor(2));
        System.out.println();
        System.out.println("SD.firstNumSelfDivisors(128, 4) "+ Arrays.toString(SD.firstNumSelfDivisors(128, 4)) );
        System.out.println("SD.firstNumSelfDivisors(10, 3) "+Arrays.toString(SD.firstNumSelfDivisors(10, 3)));
        
    }

}
