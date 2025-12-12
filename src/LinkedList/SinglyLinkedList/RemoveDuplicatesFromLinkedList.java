package LinkedList.SinglyLinkedList;

public class RemoveDuplicatesFromLinkedList {
    Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head;

        while (j != null) {
            if (i.data != j.data) {
                i.next = j;
                i = j;
            }
            j = j.next;
        }
        assert i != null;
        i.next = j;
        return head;
    }
}
