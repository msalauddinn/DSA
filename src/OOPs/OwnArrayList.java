package OOPs;
class MyArrayList {
    private int[] arr;
    private int idx;
    MyArrayList(int capacity) {
        arr = new int[capacity];
    }
    void add(int ele) {
        if (idx == arr.length) increaseCapacity();
        arr[idx++] = ele;
    }
    void add(int index, int add) throws Exception {
        if (index < 0 || index >= size()) throw new Exception("Index out of bound");
        // khud bharo
    }
    void remove() throws Exception{
        if (size() == 0) {
            throw new Exception("Index out of bound");
//            System.out.println("Array is empty");
//            return;
        }
        idx--;
    }
    void remove(int index) throws Exception {
        if (index < 0 || index >= size()) throw new Exception("Index out of bound");
        // khud bharo
    }
    int get(int index) throws Exception{
        if (index < 0 || index >= size()) throw new Exception("Index out of bound");
        return arr[index];
    }
    void set(int i, int value) throws Exception {
        if (i < 0 || i >= size()) {
            throw new Exception("Index out of bound");
        }
        arr[i] = value;
    }
    private void increaseCapacity() {
        int[] a = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        arr = a;
    }
    int capacity() {
        return arr.length;
    }
    int size() {
        return idx;
    }
    void display() {
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) throws Exception{
        MyArrayList a = new MyArrayList(5);
        // a.remove(); // ERROR
        a.add(3); a.add(4); a.add(10); a.add(29);
        a.display();
        System.out.println(a.size() + " : " + a.capacity());
        a.add(13);
        a.display();
        System.out.println(a.size() + " : " + a.capacity());
        a.add(76);
        a.display();
        System.out.println(a.size() + " : " + a.capacity());
        a.remove();
        a.display();
        System.out.println(a.size() + " : " + a.capacity());
        System.out.println(a.get(3));
        System.out.println(a.get(2));
        // System.out.println(a.get(6));
        a.set(2, 45);
        a.set(3, 20);
        a.display();
    }
}
