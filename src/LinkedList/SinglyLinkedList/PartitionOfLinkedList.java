package LinkedList.SinglyLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class PartitionOfLinkedList {
    public static ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode i = d1, j = d2, k = head;
        while (k != null) {
            if (k.val < x) {
                i.next = k;
                i = i.next;
            }
            else {
                j.next = k;
                j = j.next;
            }
            k = k.next;
        }
        j.next = null;
        i.next = d2.next;

        return d1.next;
    }
}
