package CountCompleteTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNode {
  public int countNodes(TreeNode root) {
    if(root == null) return 0;

    class Traverse{
      int length = 0;
      public void traverse(TreeNode currentNode){
        if(currentNode.left != null) traverse(currentNode.left);
        if(currentNode.right != null) traverse(currentNode.right);
        length++;
      }
    }

    Traverse traverse = new Traverse();
    traverse.traverse(root);

    return traverse.length;
  }

  public int countNodes1(TreeNode root) {
    if(root == null) return 0;

    int length = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      TreeNode currentNode = queue.poll();

      if(currentNode.left != null){
        queue.add(currentNode.left);
      }
      if(currentNode.right != null){
        queue.add(currentNode.right);
      }

      length++;
    }
    return length;
  }
}
