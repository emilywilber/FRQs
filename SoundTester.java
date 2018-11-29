import java.util.Arrays;


/**
 * tests Sound.
 *
 * @author Emily Wilber
 * @version November 20, 2018
 */
public class SoundTester
{
    /**
     * tests the stuff and prints the tests
     */
    public static void main(String[] args)
    {
        //the array of values in this sound; guarenteed not to be null
        int[] amplitude1 = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] amplitude2 = {4, 10, 11, 100, -100, 0};
        int[] amplitude3 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        int valueschanged=0;
        
        Sound S1 = new Sound(amplitude1);     
        Sound S2 = new Sound(amplitude2);
        Sound S3 = new Sound(amplitude3);
        
        
        valueschanged = S1.limitAmplitude(2000);
        System.out.println("values changed : " + valueschanged);
        System.out.println(S1);
        System.out.println();
        
        
        valueschanged = S2.limitAmplitude(50);
        System.out.println("values changed : " + valueschanged);
        System.out.println(S2);
        System.out.println();
        
        
        
        S3.trimSilenceFromBeginning();
        System.out.println(S3);
        
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
    }

}