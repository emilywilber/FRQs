
/**
 * Write a description of class Trail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trail
{
    // instance variables - replace the example below with your own
    private int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};

    /**
     * Constructor for objects of class Trail
     */
    public boolean isLevelTrailSegment(int start, int end)
    {
        int max = start;
        int min = start;
        for (int i = start; i <= end; i++) {
            if (markers[i] > max) {
                max = markers[i];
            }
            if (markers[i] < min) {
                min = markers[i];
            }
        }
        return (max-min <= 10);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isDifficult()
    {
        int count = 0;
        for (int i = 1; i < markers.length; i++) {
            if (Math.abs(markers[i] - markers[i-1]) >= 30){
                count++;
            }
        }
        return (count >= 3);
    }
}
