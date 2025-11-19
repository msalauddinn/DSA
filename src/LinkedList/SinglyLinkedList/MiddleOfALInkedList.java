package LinkedList.SinglyLinkedList;

public class MiddleOfALInkedList {
    int getMiddle(Node head) {

          // METHOD - 1 --> not for interview but optimized  --> this is two pass solution
          // What is 2 pass solution --> here we travel throw two times in a LinkedList
//        Node temp = head;
//        int len = 0;
//        while (temp != null) {
//            temp = temp.next;
//            len++;
//        }
//        temp = head;
//        for (int i = 0; i < len/2; i++) temp = temp.next;
//        return temp.data;

         // METHOD - 2 --> for interviews --> one pass solution
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
