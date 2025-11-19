package LinkedList;

public class FindFistNode {
//    public int cycleStart(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if (slow == fast) {
//                Node temp = head;
//                while (slow != temp) {
//                    slow = slow.next;
//                    temp = temp.next;
//                }
//                return slow.data;
//            }
//        }
//        return -1;
//    }
    public int cycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return -1;
        Node temp = head;
        while (slow != temp) {
            slow = slow.next;
            temp = temp.next;
        }
        return slow.data;
    }
}
