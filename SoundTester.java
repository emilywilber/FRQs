
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
        Sound S = new Sound();
        
        System.out.println(S.limitAmplitude(2000));
        System.out.println(S.limitAmplitude(10));
        
        S.trimSilenceFromBeginning();
        System.out.println(Arrays.toString(int[] samples));
    }

}
