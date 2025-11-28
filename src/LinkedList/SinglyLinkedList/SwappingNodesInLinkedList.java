package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

public class SwappingNodesInLinkedList {
    public Node swapNodes(Node head, int k) {

        // THIS METHOD IS NOT FOR INTERVIEWS BECAUSE T.C is O(n) and S.C is O(n) also

//        ArrayList<Integer> arr= new ArrayList<>();
//        Node temp = head;
//        while (temp != null) {
//            arr.add(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        int m = arr.size() - k;
//        int n = k - 1;
//        int t = arr.get(m);
//        arr.set(m, arr.get(n));
//        arr.set(n, t);
//
//        int i = 0;
//        while (i < arr.size()) {
//            temp.data = arr.get(i);
//            temp = temp.next;
//            i++;
//        }
//        return head;

        // THIS IS FOR INTERVIEW BUT NOT MUCH OPTIMIZED

//        Node temp1 = head;
//        int len = 0;
//        while (temp1 != null) {
//            temp1 = temp1.next;
//            len++;
//        }
//        temp1 = head;
//        Node temp2 = head;
//        for (int i = 0; i < len-k; i++) {
//            temp1 = temp1.next;
//        }
//        for (int i = 0; i < k-1; i++) {
//            temp2 = temp2.next;
//        }
//        int t = temp1.data;
//        temp1.data = temp2.data;
//        temp2.data = t;
//
//        return head;

        Node slow = head;
        Node fast = head;

        for (int i = 1; i < k; i++) fast = fast.next;
        Node kthFromStart = fast;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int t = slow.data;
        slow.data = kthFromStart.data;
        kthFromStart.data = t;

        return head;
    }
}
