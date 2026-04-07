package NumberOfOneBits;

public class NumberOfOneBits {
  public int hammingWeight(int n) {
    int times = 0;

    while(n > 0){
      int remainder = n % 2;
      int divisibleBy = n / 2;

      if(remainder == 1) times++;
      n = divisibleBy;
    }
    return times;
  }

  public int hammingWeight1(int n) {
    String binaryValue = Integer.toBinaryString(n);
    int times = 0;

    for(char c : binaryValue.toCharArray()){
      if(String.valueOf(c).equals("1")){
        times++;
      }
    }
    return times;
  }
}
