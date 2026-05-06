package BinaryTreePath;

public class Main {
  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(
        1);

    Soltuion soltuion = new Soltuion();

    System.out.println(soltuion.binaryTreePaths(treeNode).toString());
  }
}