package LinkedList.SinglyLinkedList;

public class SegregateEvenOdd {
    Node divide(Node head) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);

        Node i = d1, j = d2, k = head;

        while (k != null) {
            if (k.data % 2 != 0) {
                j.next = k;
                j = j.next;
            }
            else {
                i.next = k;
                i = i.next;
            }
            k = k.next;
        }
        i.next = d2.next;
        j.next = null;
        return d1.next;
    }
}
