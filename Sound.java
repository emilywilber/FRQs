import java.util.Arrays;

/**
 * Write a description of class Sound here.
 *
 * @author Emily Wilber
 * @version November 20, 2018
 */
public class Sound
{
    //the array of values in this sound; guarenteed not to be null
    private int[] samples;
    
    /**
     * Makes a copy of the original samples and puts it in a local variable
     * @param inputSamples   the original array
     */
    public Sound(int[] inputSamples) {
        this.samples = inputSamples;
    }
    
    /**
     * Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to -limit.
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
        while (samples[numzeros] == 0) {
            numzeros++;
        }
        
        int[] noSilence = new int[samples.length - numzeros];
        for (int j = 0; j < noSilence.length; j++) {
            noSilence[j] = samples[j + numzeros];
        }
        samples = noSilence;
    }
    
    /**
     * @return the current state of samples
     */
    public String toString() {
        return "Sound: " + Arrays.toString(samples);   
    }
}