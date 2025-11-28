package LinkedList.SinglyLinkedList;

public class RemoveNthNodeFromEndOfList {
    public Node removeNthFromEnd(Node head, int n) {
        if (head.next == null) return null;
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
