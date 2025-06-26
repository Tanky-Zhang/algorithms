package com.tanky.hot100;

/**
 * @author zhangzhongguo <zhangzhongguo@kuaishou.com>
 * Created on 2025-04-25
 */
public class DeleteN {


    //leetcode submit region begin(Prohibit modification and deletion)

    //import com.tanky.structure.linkedlist.LoopListNode.ListNode;

    //import com.tanky.structure.linkedlist.LoopListNode.ListNode;


    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        //        ListNode dummy = new ListNode(0, head);
        //        ListNode p2 = dummy;
        //将p1推到第n个位置
        for (int i = 0; i <= n && p1 != null; i++) {
            p1 = p1.next;
        }
        //p2从头开始
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        //删除p2这个位置
        if (p2 != null && p2.next != null) {
            p2.next = p2.next.next;
        } else {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        removeNthFromEnd(head, 2);
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
