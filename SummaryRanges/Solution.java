package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    }

    int i = 0;
    while (i < nums.length) {
      int start = nums[i];
      int j = i;
      while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
        j++;
      }

      if (nums[j] == start) {
        result.add(String.valueOf(start));
      } else {
        result.add(start + "->" + nums[j]);
      }

      i = j + 1;
    }
    return result;
  }

  public List<String> summaryRanges1(int[] nums) {
    List<String> result = new ArrayList<>();
    if (nums.length == 0) return result;

    int start = nums[0];
    for (int i = 1; i <= nums.length; i++) {
      if (i == nums.length || nums[i] != nums[i - 1] + 1) {
        if (start == nums[i - 1]) {
          result.add(String.valueOf(start));
        } else {
          result.add(start + "->" + nums[i - 1]);
        }
        if (i < nums.length) start = nums[i];
      }
    }
    return result;
  }
}
