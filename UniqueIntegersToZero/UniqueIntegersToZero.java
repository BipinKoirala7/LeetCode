
/**
 * Title: Find N Unique Integers Sum up to Zero
 * Problem: Given an integer n, return any array containing n unique integers
 * such that they add up to 0.
 * 
 * Example 1:
 * 
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 * Example 2:
 * 
 * Input: n = 3
 * Output: [-1,0,1]
 * Example 3:
 * 
 * Input: n = 1
 * Output: [0]
 * 
 * Constraints:
 * 1 <= n <= 1000
 * 
 * Complexity Analysis: 
 * Time: 0ms
 * Time Complexity: O(n), beats 100%
 * Space: 42.16MB
 * Space Complexity: O(n), beats 5.56%
 * 
 * My Approach: 
 * We can create an array of n length provided in parameter. If n equals one 
 * then we can just return the array [0]. First we take mid point in the array
 * and we check if the first point is even or odd. If odd, then we can make the 
 * mid (arr[mid] = 0) value to 0. Then, we loop through the array and take i + 1
 * and make a number say 1. And, put 1 and -1 in each opposite of the array to 
 * make sum equals to zero.
 * 
 * @author Bipinkoirala
 * @version 1.0
 */
public class UniqueIntegersToZero {

    /**
     * Returns an array where the sum of all elements equals to 0.
     * 
     * @param n the length of the array
     * @return array whose sum of all elements equals to 0
     */
    public int[] sumZero(int n) {
        // Initialize the array of length n
        int[] arr = new int[n];

        // Check if n is 1 so we can return [0]
        if (n == 1) {
            return arr;
        }

        // Find the mid point of the array
        int mid = n / 2;

        // if mid point is odd, then make middle of array from both end 0.
        if ((double) n % 2 != 0) {
            arr[mid] = 0;
        }

        // Loop to find a number and put positive and negative in each end.
        for (int i = 0; i < mid; i++) {
            int num = i + 1;
            arr[i] = num;
            arr[n - 1 - i] = num * -1;
        }

        // Return the array.
        return arr;
    }
}
