package LinkedList.SinglyLinkedList;

public class KthFromEnd {
    int getKthFromLast(Node head, int k) {

            // METHOD - 1 --> two pass solution
//        Node temp = head;
//        int len = 0;
//        while (temp != null) {
//            temp = temp.next;
//            len++;
//        }
//        temp = head;
//        if (k  <= len) {
//            for (int i = 0; i < len-k; i++) temp = temp.next;
//            return temp.data;
//        }
//        else return -1;

            // METHOD - 2 --> one pass solution
        Node slow = head, fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
