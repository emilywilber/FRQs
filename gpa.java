
/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa
{
    
    /**
     * Constructor for objects of class gpa
     */
    public static double gpa(String grades)
    {
        double sum = 0;
        for(int i = 0; i < grades.length(); i++) {
            String grade = grades.substring(i, i+1);
            if (grade.equals("A")) {
                sum += 4;
            }
            else if (grade.equals("B")) {
                sum += 3;
            }
            else if (grade.equals("C")) {
                sum += 2;
            }
            else if (grade.equals("D")) {
                sum ++;
            }
            else {
                sum = sum;
            }
        }
        return sum/grades.length();
    }

    public static void tester() {
        System.out.println("ABCDBFC: " + gpa("ABCDBFC"));
        System.out.println("AAA: " + gpa("AAA"));
        System.out.println("ABA: " + gpa("ABA"));
        System.out.println("FFFD: " + gpa("FFFD"));
        System.out.println("ABCDF: " + gpa("ABCDF"));
    }
}
