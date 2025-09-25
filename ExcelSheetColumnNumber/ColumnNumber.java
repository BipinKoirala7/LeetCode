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
 * If we take a sum integer result to track the sum and loop over the character array from the columnTitle, then
 * we can get the value we need. We can use ascii number to find the value of the alphabet and since every step 
 * is worth 26 we can multiply the previous result by 26 before adding next number if exists.
 * 
 * Complexity Analysis:
 * Time: 1ms, Beats 89.28%
 * Time Complexity: 0(n)
 * Memory Space: 42.2 MB
 * Space Complexity: 0(1)
 * 
 * @author BipinKoirala
 * @since 1.0
 */

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
        int result = 0;

        // loop over the character array created from column title to find the sum
        for (char c : columnCharArray) {
            result = result * 26 + (c - 'A' + 1);
        }
        // return the final sum
        return result;
    }
}
