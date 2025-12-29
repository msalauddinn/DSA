package LinkedList.SinglyLinkedList;

public class ReverseSublistOfALinkedList {
    public static Node reverseBetween(int l, int r, Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node a = null;
        Node b = null;
        Node c = null;
        Node d = null;
        Node temp = dummy;

        for (int i = 0; i <= r + 1; i++) {
            if (i == l-1) a = temp;
            if (i == l) b = temp;
            if (i == r) c = temp;
            if (i == r+1) d = temp;
            if (temp == null) break;

            temp = temp.next;
        }
        assert a != null;
        a.next = null;
        assert c != null;
        c.next = null;

        c = reverseList(b);
        a.next = c;
        b.next = d;
        return dummy.next;
    }
    public static Node reverseList(Node head) { // using three pointer
        if (head == null || head.next == null) return head;
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
}
