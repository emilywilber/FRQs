
/**
 * Write a description of class Sound here.
 *
 * @author Emily Wilber
 * @version November 20, 2018
 */
public class Sound
{
    //the array of values in this sound; guarenteed not to be null
    private int[] samples = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
    
    /**
     * Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -lmit are changed to -limit.
     * @param limit   the amplitude limit
     *        Precondition: limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit)
    {
        int count = 0;
        
        for (int i = 0; i < samples.length; i++) {
            if (Math.abs(samples[i]) > limit) {
                count++;
                if (samples[i] > limit) {
                    samples[i] = limit;
                }
                else {
                    samples[i] = -1 * limit;
                }
            }
        }
        return count;
    }
    
    /**
     *  Removes all silence from the beginning of this sound.
     *  Silence is represneted by a value of 0.
     *  Precondition: samples  contains at least one nonzero value
     *  Postcondition: the length of samples reflects the removal of starting silence. 
     */
    public void trimSilenceFromBeginning() {
        int numzeros = 0;
        int startingIndex = 0;
        for (int i= 0; i < samples.length; i++) {
            if (samples[i] == 0) {
                numzeros++;
            }
            else {
                startingIndex = i;
                break;
            }
        }
        
        int[] noSilence = new int[samples.length - numzeros];
        for (int j = 0; j < noSilence.length; j++) {
            noSilence[j] = samples[j+ numzeros];
        }
        samples = noSilence;
    }
}
