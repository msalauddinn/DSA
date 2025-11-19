package LinkedList.SinglyLinkedList;
class Node { // User defined data type
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
class MyLinkedList { // User defined data structure
    private Node head;
    private Node tail;
    private int size;

    void insertAtTail(int ele) { // T.C = O(1)
        Node node = new Node(ele);
        if (size == 0) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    void insertAtHead(int ele) { // T.C = O(1)
        Node node = new Node(ele);
        if (size == 0) head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }
    void insertAtAny(int idx, int ele) throws Exception { // T.C = O(n)
        if (idx < 0 || idx > size) throw new Exception("Index out of bound");
        else if (idx == 0) insertAtHead(ele);
        else if (idx == size) insertAtTail(ele);
        else {
            Node temp = head;
            for (int i = 1; i < idx; i++) temp = temp.next;
            Node node = new Node(ele);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    void deleteFromHead() throws Exception{ // T.C = O(1)
        if (size == 0) throw new Exception("List is Empty!!");
        head= head.next;
        size--;
    }
    void delete(int idx) throws Exception{ // T.C = O(n)
        if (idx < 0 || idx >= size) throw new Exception("Index out of bound!!");
        else if (idx == 0) deleteFromHead();
        else {
            Node temp = head;
            for (int i = 1; i < idx; i++) temp = temp.next;
            temp.next = temp.next.next;
            size--;
        }
    }
    int get(int idx) throws Exception{ // T.C = O(n)
        if (idx < 0 || idx >= size) throw new Exception("Index out of bound!!");
        Node temp = head;
        for (int i = 0; i < idx; i++) temp = temp.next;
        return temp.data;
    }
    void set(int idx, int ele) throws Exception{ // T.C = O(n)
        if (idx < 0 || idx >= size) throw new Exception("Index out of bound!!");
        Node temp = head;
        for (int i = 0; i < idx; i++) temp = temp.next;
        temp.data = ele;
    }
    void display() { // // T.C = O(n) if size n
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int size() {
        return size;
    }
}
public class OwnLinkedList {
    public static void main(String[] args) throws Exception{
        MyLinkedList list = new MyLinkedList();
        // list.deleteFromHead(); // will give exception
//        list.insertAtTail(10);
//        list.insertAtTail(20);
//        list.display();
//        System.out.println(list.size());
//        list.insertAtHead(3);
//        list.display();
//        System.out.println(list.size());
//        list.insertAtHead(5);
//        list.display();
//        System.out.println(list.size());
//        list.deleteFromHead();
//        list.display();
//        System.out.println(list.size());
        System.out.println(list.size());
        list.insertAtAny(0, 39);
        list.display();
        list.insertAtAny(1, 18);
        list.display();
        list.insertAtAny(2, 19);
        list.display();
        list.insertAtAny(0, 14);
        list.display();
        list.insertAtAny(2, 57);
        list.display();
        list.insertAtAny(5, 52);
        list.display();
        list.set(4, 24);
        list.set(0, 33);
        list.set(5, 93);
        list.display();
        System.out.println(list.get(4));
        System.out.println(list.get(2));
        list.delete(5);
        list.display();
        list.delete(0);
        list.display();
    }
}