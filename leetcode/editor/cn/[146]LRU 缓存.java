import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class LRUCache {


    class ListNode {

        int key;
        int value;

        ListNode pre;
        ListNode next;

        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }


    }

    Map<Integer, ListNode> cache = new HashMap<>();
    int capacity = 0;
    int size = 0;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode(0, 0);
        tail = new ListNode(0, 0);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {

        ListNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(ListNode node) {
        removeNode(node);
        node.pre = head;
        node.next = head.next;

        head.next.pre = node;
        head.next = node;
    }

    public void put(int key, int value) {

        ListNode exist = cache.get(key);

        if (exist == null) {

            ListNode node = new ListNode(key, value);

            cache.put(key, node);

            addToHead(node);

            size++;

            if (size > capacity) {
                //淘汰
                ListNode tail = deleteTail();
                cache.remove(tail.key);
                size--;
            }
        } else {
            exist.value = value;
            moveToHead(exist);
        }
    }

    private void addToHead(ListNode node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private ListNode deleteTail() {
        ListNode tmp = tail.pre;
        removeNode(tail.pre);
        return tmp;
    }


    public void removeNode(ListNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)
