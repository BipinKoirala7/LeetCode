package PlusOne;

/**
 * Title: Plus One
 * Link:
 * Problem: You are given a large integer represented as an integer array
 * digits, where each digits[i] is the ith digit of the integer. The digits are
 * ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 * Constraints:
 * 
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 * 
 * My Approach:
 * We can loop through digits backwards and then add 1 to element. If sum equals 10 or more, 
 * then we should continue the loop and again add 1 to next and repeat again. If not, then break
 * loop.
 * 
 * Complexity Analysis:
 * Time Complexity: 0ms, O(N)
 * Space Complexity: 42.00 MB, O(N)
 * 
 * @author Bipinkoirala
 * @version 1.0
 */
public class PlusOne {

    /**
     * Returns digits array after adding 1
     * 
     * @param digits array of numbers
     * @return updated digits array
     */
    public int[] plusOne(int[] digits) {
        //  If digits is null, then return null
        if (digits == null) {
            return null;
        }

        //  Loop digits for operation
        for (int i = digits.length - 1; i >= 0; i--) {
            //  Add one to each element
            digits[i] = digits[i] + 1;

            //  If digit hits 10, then we need to add number in next element
            if (digits[i] == 10) {
                digits[i] = digits[i] % 10;
                if (i == 0) {
                    int[] newArray = new int[digits.length + 1];
                    System.arraycopy(digits, 0, newArray, 1, digits.length);
                    newArray[0] = 1;
                    digits = newArray;
                }
                continue;
            }
            break;
        }
        //  Return updated array
        return digits;
    }
}
