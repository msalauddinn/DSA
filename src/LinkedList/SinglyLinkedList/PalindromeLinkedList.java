package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

public class PalindromeLinkedList {
        // METHOD 1 : Using ArrayList T.C = O(n) and A.S = O(n)
//    public boolean isPalindrome(Node head) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        Node temp = head;
//        while (temp != null) {
//            arr.add(temp.data);
//            temp = temp.next;
//        }
//        int i = 0, j = arr.size()-1;
//        while (i < j) {
//            if (!arr.get(i).equals(arr.get(j))) return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
        // METHOD 2 : Using Duplicate list or Deep Copy T.C = O(n) and A.S = O(n)
//    public boolean isPalindrome(Node head) {
//        Node dummy = new Node(-1);
//        Node i = dummy;
//        Node j = head;
//
//        while (j != null) {
//            i.next = new Node(j.data);
//            i = i.next;
//            j = j.next;
//        }
//        dummy = dummy.next;
//        i = reverseList(dummy);
//        j = head;
//
//        while (i != null) {
//            if (i.data != j.data) return false;
//            i = i.next;
//            j = j.next;
//        }
//        return true;
//    }
//    Node reverseList(Node head) { // using three pointer
//        if (head == null || head.next == null) return head;
//        Node previous = null;
//        Node current = head;
//
//        while (current != null) {
//            Node forward = current.next;
//            current.next = previous;
//            previous = current;
//            current = forward;
//        }
//        return previous;
//    }
        // METHOD 3 : Using Constant Space T.C = O(n) and A.S = O(1)

    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = head;

        Node a = reverseList(fast);
        while (slow != null && a != null) {
            if (slow.data != a.data) return false;
            slow = slow.next;
            a = a.next;
        }
        return true;
    }
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