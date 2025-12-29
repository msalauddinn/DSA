package LinkedList.CircularLinkedList;

public class DeletionInCircularLinkedList {
    Node deleteNode(Node head, int key) {
        if (head.next == head && head.data == key) return null;
        Node temp = head;
        while (temp.next != head) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        if (head.data == key) {
            temp.next = head.next;
            head = head.next;
        }
        return head;
    }
}
