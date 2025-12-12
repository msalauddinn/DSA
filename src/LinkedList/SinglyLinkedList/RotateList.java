package LinkedList.SinglyLinkedList;

public class RotateList {
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;

        int len = 0;
        while (fast != null) {
            fast = fast.next;
            len++;
        }
        fast = head;
        k = k % len;
        if (k == 0) return head;

        for (int i = 0; i < k; i++) fast = fast.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = slow.next;
        slow.next = null;
        fast.next = head;

        return temp;
    }
}
