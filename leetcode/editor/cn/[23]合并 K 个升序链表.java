
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        ListNode node = lists[0];
        for (int i = 1; i < lists.length; i++) {
            node = mergeTwoLists(node, lists[i]);
        }
        return node;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode node1 = l1;
        ListNode node2 = l2;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                current.next = new ListNode(node1.val);
                node1 = node1.next;
            } else {
                current.next = new ListNode(node2.val);
                node2 = node2.next;
            }
            current = current.next;
        }

        if (node1 != null) {
            while (node1 != null) {
                current.next = new ListNode(node1.val);
                current = current.next;
                node1 = node1.next;
            }
        }

        if (node2 != null) {
            while (node2 != null) {
                current.next = new ListNode(node2.val);
                current = current.next;
                node2 = node2.next;
            }
        }

        return dummy.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
