package ComplementOfBaseInteger;

import java.util.Arrays;

public class ComplementOfBaseInteger {
  public int bitwiseComplement(int n) {

    if( n == 0){
      return 1;
    }

    StringBuilder sb = new StringBuilder();

    for(int i = n; i > 0; i = i / 2){

      System.out.println("Number: " + i);
      System.out.println("Reminder: " + i % 2);
      System.out.print("Reminder Inverted: ");
      System.out.println(i % 2 == 0 ? 1 : 0);

      int remainder = i % 2;
      int inverted = remainder == 0 ? 1 : 0;
      sb.insert(0, inverted);
    }

    System.out.println("Binary Value: " + sb);

    return Integer.parseInt(sb.toString(), 2);
  }

  public int bitwiseComplement2(int n) {
    StringBuilder sb = new StringBuilder();
    Arrays.stream(Integer.toBinaryString(n).split("")).forEach(num -> {
      if (num.equals("1")) {
        sb.append("0");
      } else {
        sb.append("1");
      }
    });
    return Integer.parseInt(sb.toString(), 2);
  }
}
