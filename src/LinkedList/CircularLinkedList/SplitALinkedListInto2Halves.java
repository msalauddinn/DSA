package LinkedList.CircularLinkedList;
class Pair<A, B> {
    public A first;
    public B last;

    Pair(A first, B last) {
        this.first = first;
        this.last = last;
    }
}
public class SplitALinkedListInto2Halves {
    public Pair<Node, Node> splitList(Node head) {
        if (head == null) return new Pair<>(null, null);
        if (head.next == null) return new Pair<>(head, null);
        if (head.next.next == head) {
            Node a = head.next;
            head.next = head;
            a.next = a;

            return new Pair<>(head, a);
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node a = slow.next;
        slow.next = head;
        if (fast.next == head) fast.next = a;
        else fast.next.next = a;

        return new Pair<>(head, a);
    }
}
