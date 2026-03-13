package RemoveLinkedListElements;

public class RemoveLinkedListElements {
  public ListNode removeElements(ListNode head, int val) {
    ListNode prev = null;
    ListNode temp = head;

    while(temp != null){
      if(temp.val == val){
        if(temp == head){
          head = head.next;
          temp = temp.next;
          continue;
        }
        prev.next = temp.next;
        temp = prev.next;
        continue;
      }

      prev = temp;
      temp = temp.next;
    }
    return head;
  }
}
