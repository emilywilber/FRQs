
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
            
            //System.out.println("{50, 50, 20, 80, 53} = " + SR.finalAverage());
            System.out.println("{20, 50, 50 , 53, 80} = " + SR.finalAverage());
            //System.out.println("{20, 50, 50, 80} = " + SR.finalAverage());
        }
    }
}
