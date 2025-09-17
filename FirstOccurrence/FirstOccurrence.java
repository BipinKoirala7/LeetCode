package FirstOccurrence;

/**
 * Problem: Find the index of the first occurrence of a string.
 * Link:
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * 
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Constraints:
 * 1 <= haystack.length, needle.length <= 10^4
 * haystack and needle consist of only lowercase English characters.
 * 
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * 
 * Complexity Analysis:
 * Time Complexity: O((n - m) * m), where n = haystack length, m = needle length
 * Space Complexity: O(1)
 * 
 * @author my_name
 * @since 1.0
 */
public class FirstOccurrence {

    /**
     * Finds the index of the first occurrence of the substring needle in haystack.
     * 
     * @param haystack the main string to be searched
     * @param needle   the substring to look for
     * @return the index of the first occurrence of needle, or -1 if not found
     * @throws NullPointerException if haystack or needle is null
     */
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty or longer than haystack, return -1
        if (needle.length() > haystack.length() || needle.length() == 0) {
            return -1;
        }

        // Loop through haystack while ensuring substring boundaries are valid
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Compare substring with needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // First match found
            }
        }

        // If no match is found, return -1
        return -1;
    }
}
