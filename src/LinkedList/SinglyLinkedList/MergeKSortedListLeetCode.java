package LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeKSortedListLeetCode {
    public ListNode mergeKLists(ListNode[] arr) {
        if (arr.length == 0) return null;
        ArrayList<ListNode> list1 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<ListNode> list2 = new ArrayList<>();

        while (list1.size() + list2.size() > 1) {
            while (list1.size() > 1) {
                ListNode a = list1.removeLast();
                ListNode b = list1.removeLast();
                ListNode c = sortedMerge(a, b);
                list2.add(c);
            }
            while (list2.size() > 1) {
                ListNode a = list2.removeLast();
                ListNode b = list2.removeLast();
                ListNode c = sortedMerge(a, b);
                list1.add(c);
            }
            if (list1.size() == 1 && list2.size() == 1) {
                ListNode a = list2.remove(list2.size()-1);
                ListNode b = list1.remove(list1.size()-1);
                ListNode c = sortedMerge(a, b);
                return c;
            }
        }
        return !list1.isEmpty() ? list1.getFirst() : list2.getFirst();
    }
    ListNode sortedMerge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode i = head1;
        ListNode j = head2;
        ListNode k = dummy;

        while (i != null && j != null) {
            if (j.val < i.val) {
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
