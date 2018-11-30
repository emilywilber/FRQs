 


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
            int[] scores1 = {50, 50, 20, 80, 53};
            StudentRecord SR1 = new StudentRecord(scores1);
            System.out.println("{50, 50, 20, 80, 53} = " + SR1.finalAverage());
            
            int[] scores2 = {20, 50, 50 ,53 , 80};
            StudentRecord SR2 = new StudentRecord(scores2);
            System.out.println("{20, 50, 50 , 53, 80} = " + SR2.finalAverage());
            
            
            int[] scores3 = {20, 50, 50, 80};
            StudentRecord SR3 = new StudentRecord(scores3);
            System.out.println("{20, 50, 50, 80} = " + SR3.finalAverage());
            
            
            
        }
    }
}
