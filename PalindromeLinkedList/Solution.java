package PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public boolean isPalindrome(ListNode head) {
    StringBuilder sb = new StringBuilder();

    ListNode currentNode = head;
    while (currentNode != null) {
      sb.append(currentNode.val);
      currentNode = currentNode.next;
    }

    System.out.println(sb);
    System.out.println(sb.reverse());
    return sb.toString().equals(sb.reverse().toString());
  }

  public boolean isPalindrome2(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    int left = 0;
    int right = list.size() - 1;
    while (left < right && list.get(left) == list.get(right)) {
      left++;
      right--;
    }
    return left >= right;
  }
}
