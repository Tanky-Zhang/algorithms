
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
//        ListNode before = null;
//        ListNode current = head;
//        while (current != null) {
//
//            ListNode next = current.next;
//
//            current.next = before;
//
//            before = current;
//            current = next;
//
//
//        }
//
//        return before;
        return reverseListRecursion(head);
    }

    public ListNode reverseListRecursion(ListNode head){

        if (head==null||head.next==null){
            return head;
        }

        ListNode node=reverseListRecursion(head.next);

        head.next.next=head;
        head.next=null;
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
