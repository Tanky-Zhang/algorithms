
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dump = new ListNode(-1);

        ListNode curr = dump;
        int tmp = 0;

        while (l1 != null && l2 != null) {

            int sumVal = l1.val + l2.val + tmp;

            ListNode node = new ListNode(sumVal % 10);
            curr.next = node;
            curr = curr.next;

            tmp = sumVal / 10;
            l1 = l1.next;
            l2 = l2.next;

        }

        while (l1 != null) {
            int sumVal = l1.val + tmp;
            ListNode node = new ListNode(sumVal % 10);
            curr.next = node;
            curr = curr.next;
            tmp = sumVal / 10;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sumVal = l2.val + tmp;
            ListNode node = new ListNode(sumVal % 10);
            curr.next = node;
            curr = curr.next;
            tmp = sumVal / 10;
            l2 = l2.next;
        }

        if (tmp != 0) {
            curr.next = new ListNode(tmp);
        }

        return dump.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
