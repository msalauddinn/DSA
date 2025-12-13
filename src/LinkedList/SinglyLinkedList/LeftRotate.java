package LinkedList.SinglyLinkedList;

public class LeftRotate {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null) return head;
        Node temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
        k = k % len;
        if (k == 0) return head;
        temp = head;

        for (int i = 1; i < k; i++) temp = temp.next;
        Node a = temp;
        temp = a.next;
        Node newHead = temp;
        a.next = null;
        while (temp.next != null) temp = temp.next;
        temp.next = head;
        return newHead;
    }
}
