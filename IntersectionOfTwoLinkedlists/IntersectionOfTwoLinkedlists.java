package IntersectionOfTwoLinkedlists;

import java.util.Objects;

/**
 * Title: Find the Instersection of Two Linked Lists
 * Problem: find intersection based on memory location
 * Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
 *
 * Approach:
 * Using == which compares the memory location, we can traverse through the tree
 * to find the location where the similiar List can be found
 * 
 * Complexity Analysis:
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 *
 * @author Bipin Koirala
 * @since 1.0
 */
public class IntersectionOfTwoLinkedlists {

    /**
     * Finds the Intersection of Two Linked lists
     * 
     * @param headA First Linked Lists
     * @param headB Second Linked Lists
     * @return the intersection ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode pointerNode = headA;
        ListNode checkerNode = headB;
        while (pointerNode != null && checkerNode != null) {
            if (pointerNode == checkerNode) {
                return new ListNode(pointerNode.val);
            }
            if (Objects.isNull(checkerNode.next)) {
                pointerNode = pointerNode.next;
                checkerNode = headB;
                continue;
            }
            checkerNode = checkerNode.next;
        }

        return null;
    }

    /**
     * Finds the Intersection of Two Linked lists
     * 
     * @param headA First Linked Lists
     * @param headB Second Linked Lists
     * @return the intersection ListNode
     */
    // Faster but goes on forever if no intersection is there
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}
