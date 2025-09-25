package ExcelSheetColumnNumber;

/**
 * Title: Excel Sheet Column Number
 * Problem: Find the integer value of the given columnTitle
 * Link: https://leetcode.com/problems/excel-sheet-column-number
 * 
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding 
 * column number.
 * 
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * Z -> 26
 * AA -> 27
 * AB -> 28 
 * 
 * Example 1:
 * Input: columnTitle = "A"
 * Output: 1
 * 
 * Example 2:
 * Input: columnTitle = "AB"
 * Output: 28
 * 
 * Example 3:
 * Input: columnTitle = "ZY"
 * Output: 701
 * 
 * Constraints:
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 * 
 * Approach: 
 * If we take a sum integer to track the sum and loop over the character array from the columnTitle, then
 * we can get the value we need. For this, we would need a second method which knows about the value of 
 * capital alphabets and then using it. In the loop we need to add to the sum and we need to multiply the
 * each loop sum by 26 to the power of character array length minus 1 minus loop pointer (array.length - 1 - i)
 * then add the sum to the total sum. 26 power is required as each increase in number of alphabet goes by 26 rounds.
 * 
 * Complexity Analysis:
 * Time: 4ms, Beats 1.76%
 * Time Complexity: 0(n)
 * Memory Space: 44.6 MB
 * Space Complexity: 0(1)
 * 
 * @author BipinKoirala
 * @since 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class ColumnNumber {
    /**
     * Gives the integer value of the column title.
     * 
     * @param columnTitle the title of which we have to calculate the integer value
     * @return the integer value of column title
     */
    public int titleToNumber(String columnTitle) {
        // Create a character array so to loop over the column title.
        char[] columnCharArray = columnTitle.toCharArray();
        // integer to track the sum
        int sum = 0;

        // loop over the character array created from column title to find the sum
        for (int i = 0; i < columnCharArray.length; i++) {
            // givenStringValue gives the integer value of alphabet
            // We need to multiply the string value by 26 because every increase in length goes by 26 rounds.
            sum += givenStringValue(String.valueOf(columnCharArray[i])) * Math.pow(26, columnCharArray.length - 1 - i);
        }
        // return the final sum
        return sum;
    }

    /**
     * Gives the string value of given alphabet
     * 
     * @param alphabet of which the integer value is asked
     * @return integer value of asked alphabet
     */
    public int givenStringValue(String alphabet) {
        Map<String, Integer> alphabetMap = new HashMap<>();
        alphabetMap.put("A", 1);
        alphabetMap.put("B", 2);
        alphabetMap.put("C", 3);
        alphabetMap.put("D", 4);
        alphabetMap.put("E", 5);
        alphabetMap.put("F", 6);
        alphabetMap.put("G", 7);
        alphabetMap.put("H", 8);
        alphabetMap.put("I", 9);
        alphabetMap.put("J", 10);
        alphabetMap.put("K", 11);
        alphabetMap.put("L", 12);
        alphabetMap.put("M", 13);
        alphabetMap.put("N", 14);
        alphabetMap.put("O", 15);
        alphabetMap.put("P", 16);
        alphabetMap.put("Q", 17);
        alphabetMap.put("R", 18);
        alphabetMap.put("S", 19);
        alphabetMap.put("T", 20);
        alphabetMap.put("U", 21);
        alphabetMap.put("V", 22);
        alphabetMap.put("W", 23);
        alphabetMap.put("X", 24);
        alphabetMap.put("Y", 25);
        alphabetMap.put("Z", 26);

        return alphabetMap.get(alphabet);
    }
}
