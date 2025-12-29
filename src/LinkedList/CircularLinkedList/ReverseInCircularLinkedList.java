package LinkedList.CircularLinkedList;

public class ReverseInCircularLinkedList {
    public Node reverseCircular(Node head) {
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = null;

        Node previous = null;
        Node current = head;

        while (current != null) {
            Node forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        head.next = temp;
        return temp;
    }
}
