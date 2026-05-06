package BinaryTreePath;

import java.util.ArrayList;
import java.util.List;

class Soltuion {
  List<String> list = new ArrayList<>();
  StringBuilder sb = new StringBuilder();

  public List<String> binaryTreePaths(TreeNode head) {

    class Traverse {
      public void traverse(TreeNode currentNode) {
        addToBuilder(currentNode.value);

        if (currentNode.left != null) {
          traverse(currentNode.left);
        }

        if (currentNode.right != null) {
          traverse(currentNode.right);
        }

        if (currentNode.left == null && currentNode.right == null) {
          list.add(sb.toString());
        }
        removeFromBuilder();
      }
    }

    Traverse traverse = new Traverse();
    traverse.traverse(head);

    return list;
  }

  private void addToBuilder(int value) {
    if (sb.isEmpty()) {
      sb.append(value);
    } else {
      sb.append("->" + value);
    }
  }

  private void removeFromBuilder() {
    if (sb.length() == 1) {
      sb.deleteCharAt(0);
    } else if (!sb.isEmpty()) {
      sb.delete(sb.length() - 3, sb.length());
    }
  }
}