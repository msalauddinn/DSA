package LinkedList.SinglyLinkedList;

public class ReorderList {
    void reorderlist(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node a = slow.next;
        slow.next = null;
        a = reverse(a);
        fast = head;

        head = merge(fast, a);
    }
    public Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node i = head1, j = head2, k = dummy;

        while (i != null && j != null) {
            k.next = i;
            k = k.next;
            i = i.next;

            k.next = j;
            k = k.next;
            j = j.next;
        }
        if (j == null) k.next = i;
        if (i == null) k.next = j;

        return dummy.next;
    }
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
}
