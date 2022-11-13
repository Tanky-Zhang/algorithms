package com.tanky.structure.linkedlist;

/**
 * @author zhangzhongguo
 * @date 2022/11/13
 */
public class LoopListNode {

    public static void main(String[] args) {

        //[3,2,0,-4]

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        ListNode node = detectCycle(node1);


    }


    public static ListNode detectCycle(ListNode head) {


        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode ptr = head;
                ListNode meetNode = slow;
                while (ptr != meetNode) {
                    ptr = ptr.next;
                    meetNode = meetNode.next;
                }
                return meetNode;
            }

        }
        return null;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
