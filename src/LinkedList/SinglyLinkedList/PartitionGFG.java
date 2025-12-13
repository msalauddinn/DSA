package LinkedList.SinglyLinkedList;

public class PartitionGFG {
    public static Node partition(Node node, int x) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node d3 = new Node(-1);

        Node i = d1, j = d2, k = d3, m = node;
        while (m != null) {
            if (m.data < x) {
                i.next = m;
                i = i.next;
            }
            else if (m.data > x) {
                j.next = m;
                j = j.next;
            }
            else {
                k.next = m;
                k = k.next;
            }
            m = m.next;
        }
        i.next = d3.next;
        k.next = d2.next;
        j.next = null;
        return d1.next;
    }
}
