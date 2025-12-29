package LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeKLinkedList {
    Node mergeKLists(Node[] arr) {
        if (arr.length == 0) return null;
        ArrayList<Node> list1 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Node> list2 = new ArrayList<>();

        while (list1.size() + list2.size() > 1) {
            while (list1.size() > 1) {
                Node a = list1.removeLast();
                Node b = list1.removeLast();
                Node c = sortedMerge(a, b);
                list2.add(c);
            }
            while (list2.size() > 1) {
                Node a = list2.removeLast();
                Node b = list2.removeLast();
                Node c = sortedMerge(a, b);
                list1.add(c);
            }
            if (list1.size() == 1 && list2.size() == 1) {
                Node a = list2.removeLast();
                Node b = list1.removeLast();
                return sortedMerge(a, b);
            }
        }
        return !list1.isEmpty() ? list1.getFirst() : list2.getFirst();
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
