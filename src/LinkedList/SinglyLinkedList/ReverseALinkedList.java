package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

public class ReverseALinkedList {
      // METHOD - 1 --> Storing the nodes in an ArrayList T.C = O(n) and A.S = O(n)
//    Node reverseList(Node head) { // using extra space;
//        ArrayList<Node> arr = new ArrayList<>();
//        Node temp = head;
//        while (temp != null) {
//            arr.add(temp);
//            temp = temp.next;
//        }
//
//        for (int i = arr.size()-1; i >= 1; i--) {
//            arr.get(i).next = arr.get(i-1);
//        }
//        arr.getFirst().next = null;
//        return arr.getLast();
//    }
        // METHOD 2 --> Recursive T.C = O(n) and A.S = O(n)
//    Node reverseList(Node head) {
//        if (head == null || head.next == null) return head;
//        Node a = head.next;
//        head.next = null;
//        Node b = reverseList(a);
//        a.next = head;
//        return b;
//    }
        // METHOD 3 --> Iterative T.C = O(n) and A.S = O(1)
//    Node reverseList(Node head) { // using three pointer
//        if (head == null || head.next == null) return head;
//        Node previous = head;
//        Node current = head.next;
//        Node forward = current.next;
//        previous.next = null;
//
//        while (current != null) {
//            current.next = previous;
//            previous = current;
//            current = forward;
//            if (current != null) forward = current.next;
//        }
//        return previous;
//    }

    Node reverseList(Node head) { // using three pointer
        if (head == null || head.next == null) return head;
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
}