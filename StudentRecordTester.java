
/**
 * Tests possible scores from StudentRecord.
 *
 * @author Emily Wilber
 * @version November 13, 2018
 */
public class StudentRecordTester
{
    /**
     * Tests Student Record methods
     *
     * @param  scores  the values that the method is averaging
     * @return    the correct average of the scores
     */
    public static void main(String[] args){
        {
            StudentRecord SR = new StudentRecord();
            
            System.out.println(SR.finalAverage());
        }
    }
}
