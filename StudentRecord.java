
/**
 * Calculate a student's grade average except if the grades all improved.
 * If all grades are better than or the same as the one before it, only average 
 * the scores starting at the number of scores /2. Else, its a normal average.
 *
 * @author Emily Wilber
 * @version November 13, 2018
 */
public class StudentRecord
{
    // contains the scores to be averaged
    private int[] scores = {50, 50, 20, 80, 53};

    /**
     * Returns the average of the values in scores
     * @param first  the starting point of the values to be averaged
     * @param last   the ending point (included) of the values to be averaged
     * @return       the average of all the scores between first and last inclusive  
     */
    private double average(int first, int last)
    {
        return 3;
    }

    /**
     * Returns true if each successive value in scores is greater than or 
     * equal to the previous value or false if not
     *
     * @return  True if scores all improve or false if they dont
     */
    private boolean hasImproved()
    {
        return true;
    }
    
    /**
     * If all scores have improved, return average of the second half
     * If all scores have not improved, return average of all values
     *
     * @return  The correct average depending on whether or not all values
     *          are increasing
     */
    public double finalAverage()
    {
        return 3;
    }
}
