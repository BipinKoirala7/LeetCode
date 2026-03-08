package FindUniqueBinaryString;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class FindUniqueBinaryString {
  public String findDifferentBinaryString(String[] nums) {
    AtomicInteger ans = new AtomicInteger(0);

    Arrays.sort(nums);
    Arrays.stream(nums).forEach(num -> {

      int now = Integer.parseInt(num, 2);
      if(now == ans.get()){
        ans.set(now + 1);
      }
    });
    String binaryString = Integer.toBinaryString(ans.get());
    System.out.println("Binary String: " + binaryString);
    return String.format("%" + nums.length + "s", binaryString).replace(' ', '0');
  }
}
