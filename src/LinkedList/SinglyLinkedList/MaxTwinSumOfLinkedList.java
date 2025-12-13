package LinkedList.SinglyLinkedList;

public class MaxTwinSumOfLinkedList {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        assert fast != null;
        assert fast.next != null;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow;
        slow = slow.next;
        a.next = null;
        fast = head;
        slow = reverse(slow);

        int MaxSum = Integer.MIN_VALUE;
        while (slow != null && fast != null) {
            int sum = fast.val + slow.val;
            if (sum > MaxSum) MaxSum = sum;
            slow = slow.next;
            fast = fast.next;
        }
        return MaxSum;
    }
    public ListNode reverse (ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
}
