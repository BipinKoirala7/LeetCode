package ReverseString;

public class ReverseString {
  public char[] reverseString(char[] s) {
    char[] reversedChar = new char[s.length];
    for (int i = 0; i < s.length; i++) {
      int j = s.length - i - 1;

      System.out.println("i: " + i);
      System.out.println("j: " + j);
      System.out.println("Element at j: " + s[j]);

      reversedChar[i] = s[s.length - i - 1];
    }
    s = reversedChar;
    return s;
  }

  public void reverseString1(char[] s){
    int start = 0;
    int end = s.length - 1;

    while(start <= end){

      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;

      start++;
      end--;
    }
  }
}
