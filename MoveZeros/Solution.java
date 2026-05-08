package MoveZeros;

import java.util.Arrays;

class Solution {

  public void moveZeros(int[] nums) {
    int late = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[late] = nums[i];
        if (late != i)
          nums[i] = 0;
        late++;
      }
    }
  }

  public void moveZeros1(int[] nums) {
    int countOfZeros = 0;
    int late = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        countOfZeros++;
        continue;
      }

      nums[late] = nums[i];
      late++;
    }

    while (countOfZeros > 0) {
      nums[nums.length - countOfZeros] = 0;
      countOfZeros--;
    }
  }

  // This would work if we could return the arrayl
  public void moveZeros2(int[] nums) {

    int[] sortedArray = new int[nums.length];
    int x = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        sortedArray[x] = nums[i];
        x++;
      }
    }

    System.out.println(Arrays.toString(sortedArray));

    nums = sortedArray;
  }
}