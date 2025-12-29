package LinkedList.CircularLinkedList;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class CircularLinkedListTraversal {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }
}
