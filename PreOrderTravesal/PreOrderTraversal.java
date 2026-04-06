package PreOrderTravesal;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

  public List<Integer> preorderTraversal(TreeNode root) {
    if(root == null) return List.of();
    List<Integer> results = new ArrayList<>();

    class Traverse{
      Traverse(TreeNode currentNode){
        results.add(currentNode.val);

        if(currentNode.left != null){
          new Traverse(currentNode.left);
        }
        if(currentNode.right != null){
          new Traverse(currentNode.right);
        }
      }
    }

    new Traverse(root);
    return results;
  }
}
