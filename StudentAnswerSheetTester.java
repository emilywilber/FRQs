import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * tests the thing
 *
 * @author Emily Wilber
 * @version Jan 31, 2019
 */
public class StudentAnswerSheetTester
{
    public static void main(String[] args)
    {
        ArrayList<String> key = new ArrayList<String>
                        (Arrays.asList(new String[] {"A", "B"}));
                        
        ArrayList<String> paulAns = new ArrayList<String>
                        (Arrays.asList(new String[] {"A", "B"}));
        
        StudentAnswerSheet paul = new StudentAnswerSheet(paulAns, "Paul");
        System.out.println(paul.getName() + ": " + paul.getScore(key));
        
        
        TestResults T = new TestResults();
        
        
    }
}
