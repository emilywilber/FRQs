
/**
 * Write a description of class SelfDivisor here.
 *
 * @author Emily Wilber
 * @version October 29, 2018
 */
public class SelfDivisor
{
   
    /**
     * @param number the number to be tested
     *      Precondition: number > 0
     * @return true if every decimal digit of number is a divisor of number;
     *      false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int current;
        int editedNumber = number;
        while (editedNumber > 0) {
            current = editedNumber % 10;
            if (current == 0){
                return false;
            }
            if (number % current != 0) {
                return false;
            }
            editedNumber = editedNumber / 10;
        }
        return true;
    }

    /**
    *   @param start starting point for values to be checked
    *       Precondition: start > 0
    *   @param num the size of the array to be returned
    *       Precondition: start > 0
    *   @return an array contain the first num integers >= that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int[] result = new int[num];
        int count = 0;
        while (count < num) {
            if (isSelfDivisor(start)) {
                result[count] = start;
                count++;
            }
            start++;
        }
  
        return result;
    }
}
