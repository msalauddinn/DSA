package LinkedList.SinglyLinkedList;

public class NodeClass {
    // with recursion
    void display(Node head) {
        if (head == null) return;
        // normal print
        System.out.print(head.data + " "); // T.C = O(n) S.C = O(n)
        display(head.next);
        // reverse print
        System.out.print(head.data + " ");
    }
    void print(Node head) {
        Node temp = head;
        while (temp != null) { // T.C = O(n) S.C = O(1)
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
//        for (Node temp = head; temp != null; temp = temp.next) {
//            System.out.print(temp.data + " ");
//        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b; // a ke next me b ka address aa gaya
        b.next = c;
        c.next = d;

        NodeClass nc = new NodeClass();

        // Print This List
        nc.print(a);
        nc.display(a);
        System.out.println();
        System.out.println(length(a));

        Node temp = a; // temp is shallow copy of a
//        temp.data = 100;
//        System.out.println(a.data);

        // temp = b; // this means now temp is shallow copy of b
        // we can't access a using temp now;
        // System.out.println(a.data);

//        System.out.println(a.next.next.next.data);
//        System.out.println(b.next.data);
//
//        System.out.println(a.next);
//        System.out.println(b);
//        System.out.println(b.next);
//        System.out.println(a.next.next);
//        System.out.println(c);
    }

    private static int length(Node head) { // O(n)
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
}
