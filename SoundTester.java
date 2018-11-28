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
     * Constructor for objects of class SoundTester
     */
    public static void main(String[] args)
    {
        //the array of values in this sound; guarenteed not to be null
        int[] amplitude = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        //int[] amplitude = {4, 10, 11, 100, -100, 0};
        Sound S = new Sound();
        S.limitAmplitude(2000);
        System.out.println(Arrays.toString(amplitude));
        
        System.out.println(S.limitAmplitude(10));
        
        S.trimSilenceFromBeginning();
    }

}
