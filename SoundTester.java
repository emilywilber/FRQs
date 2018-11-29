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
        int[] originalamplitude = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        //int[] amplitude = {4, 10, 11, 100, -100, 0};
        int[] amplitude = new int[originalamplitude.length];
        int valueschanged=0;
        

        Sound S = new Sound();     
        
        // make a copy of the original list of amplitudes
        for (int i = 0; i < originalamplitude.length; i++) {
            amplitude[i] = originalamplitude[i];
        }
       
        // Tell the Sound object what amplitdues we are working with
        S.setsamples(amplitude);
        
        // Limit values to be within abs (2000)
        valueschanged = S.limitAmplitude(2000);
        
        
        System.out.println(Arrays.toString(amplitude));
        System.out.println("values changed : " + valueschanged);
        
        for (int i = 0; i < originalamplitude.length; i++) {
            amplitude[i] = originalamplitude[i];
        }
        S.setsamples(amplitude);
        valueschanged = S.limitAmplitude(2400);
        System.out.println(Arrays.toString(amplitude));
        System.out.println("second values changed : " + valueschanged);
        

        
        S.trimSilenceFromBeginning();
    }

}