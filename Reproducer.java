import FindUniqueBinaryString.FindUniqueBinaryString;

public class Reproducer {
    public static void main(String[] args) {
        FindUniqueBinaryString uniqueBinaryString = new FindUniqueBinaryString();
        try {
            String result = uniqueBinaryString.findDifferentBinaryString(new String[] {"00","01"});
            System.out.println("Result: '" + result + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
