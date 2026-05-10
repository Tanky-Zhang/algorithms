
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
    public ListNode sortList(ListNode head) {
        return sortListNode(head, null);
    }

    private ListNode sortListNode(ListNode head, ListNode tail) {

        if (head == null) {
            return null;
        }

        if (head.next == tail) {
            //不置为空，会形成环
            head.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;

        ListNode left = sortListNode(head, mid);
        ListNode right = sortListNode(mid, tail);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {

        ListNode p1 = left;
        ListNode p2 = right;

        ListNode dumpy = new ListNode(0);
        ListNode curr = dumpy;
        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                curr.next = p2;
                p2 = p2.next;
            } else {
                curr.next = p1;
                p1 = p1.next;
            }
            curr = curr.next;
        }

        if (p1 != null) {
            curr.next = p1;
        }

        if (p2 != null) {
            curr.next = p2;
        }

        return dumpy.next;

    }

}
//leetcode submit region end(Prohibit modification and deletion)
