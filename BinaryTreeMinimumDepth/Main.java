package BinaryTreeMinimumDepth;

public class Main {

  static void main() {
    BinaryTreeMinimumDepth minimumDepth = new BinaryTreeMinimumDepth();
    System.out.println(minimumDepth.minDepth(
        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))
    ));
  }
}
