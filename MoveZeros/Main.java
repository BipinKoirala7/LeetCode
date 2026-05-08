package MoveZeros;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = { 1 };

    solution.moveZeros(nums);
    System.out.println(Arrays.toString(nums));
  }
}
