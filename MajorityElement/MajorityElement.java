package MajorityElement;

/**
 * Title: Majority Element
 * Problem: Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * Link: https://leetcode.com/problems/majority-element/
 * 
 * Example 1:
 *  Input: nums = [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * Constraints:
 * - n == nums.length 
 * - 1 <= n <= 5 * 10^4
 * - -109 <= nums[i] <= 10^9
 * 
 * Complexity Analysis:
 * Time: 24ms
 * Time Complexity: O(n)
 * Memory: 48.42 MB
 * Space Complexity: O(n)
 * 
 * My Approach: 
 * We could use a HashMap or Hash Table to have a mapping object for counting the various numbers occurring.
 * Then, we could loop over the given `nums` and check if the num has already occurred. If yes, then just use
 * map.put(num, map.get() + 1) adding 1 to the count, else we could just add a new object to the map. then we 
 * can have a highest pointer to point to the highest. We can check if the number in the loop has higher count
 * value than the highest. If yes, then replace highest with the num, else nothing changes and at last return
 * the highest value.
 * 
 * @author Bipinkoirala
 * @since 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Gives a number that is the most occurring in the array nums.
     * 
     * @param nums the array of numbers
     * @return the most occurring number
     */
    public int majorityElement(int[] nums) {
        // pointer for tracking highest occurring number
        int highest = nums[0];
        // HashMap to store the count of occurring numbers
        Map<Integer, Integer> map = new HashMap<>();

        // Loop over nums to find
        for (int num : nums) {
            // if the number is already counted, then just add the count by 1
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                // if not then create one
                map.put(num, 1);
            }
            // Check on every loop to see if the loop number has occurred more than the
            // previous highest.
            if (map.get(num) > map.get(highest)) {
                highest = num;
            }
        }
        // return the highest occurring number.
        return highest;
    }
}