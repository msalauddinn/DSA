package LinkedList.SinglyLinkedList;

public class MergeSortForLinkedList {
    public Node mergeSort(Node head) {
        Node slow = head;
        Node fast = head;

        if (head.next == null) return head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = slow.next;
        slow.next = null;

        head = mergeSort(head);
        temp = mergeSort(temp);
        return sortedMerge(head, temp);

    }
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k = dummy;

        while (i != null && j != null) {
            if (j.data < i.data) {
                k.next = j;
                j = j.next;
            }
            else {
                k.next = i;
                i = i.next;
            }
            k = k.next;
        }
        if (j == null) k.next = i;
        if (i == null) k.next = j;

        return dummy.next;
    }
}
