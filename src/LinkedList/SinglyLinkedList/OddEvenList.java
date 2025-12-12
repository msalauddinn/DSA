package LinkedList.SinglyLinkedList;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode i = d1, j = d2, k = head;
        int idx = 1;

        while (k != null) {
            if (idx % 2 != 0) {
                i.next = k;
                i = i.next;
            }
            else {
                j.next = k;
                j = j.next;
            }
            k = k.next;
            idx++;
        }
        j.next = null;
        i.next = d2.next;

        return d1.next;
    }
}
