package LinkedList.SinglyLinkedList;

public class SwapNodesInPair {
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode d1 = new ListNode(-1);
        ListNode i = list1, j = list2, k = d1;

        while (i != null && j != null) {
            k.next = j;
            j = j.next;
            k = k.next;

            k.next = i;
            i = i.next;
            k = k.next;
        }
        if (i == null) k.next = j;
        if (j == null) k.next = i;
        return d1.next;
    }

    public ListNode swapPairs(ListNode head) {
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
        i.next = null;
        j.next = null;

        return merge(d1.next, d2.next);
    }
}