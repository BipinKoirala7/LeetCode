package CountCompleteTreeNode;

public class Main {
  static void main() {
    TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5)),
        new TreeNode(3, null, new TreeNode(6)));

    CountCompleteTreeNode countCompleteTreeNode = new CountCompleteTreeNode();
    System.out.println("Length: " + countCompleteTreeNode.countNodes(root));
  }
}
