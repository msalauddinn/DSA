package OOPs;
class Point {
    int x;
    int y;
    final int z = 0; // final keyword do that we can't change this value again

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.print("(" + this.x + "," + this.y + ")");
    }
    void quadrant(int x, int y) {
        if (x > 0) {
            if (y > 0) System.out.println(" is lie at 1st quadrant");
            else if (y < 0) System.out.println(" is lie at 4th quadrant");
            else System.out.println(" is lie on x-Axis");
        }
        else if (x < 0) {
            if (y > 0) System.out.println(" is lie at 2nd quadrant");
            else if (y < 0) System.out.println(" is lie at 3rd quadrant");
            else System.out.println(" is lie on x-Axis");

        }
        else {
            if (y == 0) System.out.println(" is lie on origin");
            else System.out.println(" is lie on y-Axis");

        }
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Point p1 = new Point(-3, 4);
        // p1.z = 7; ERROR
        p1.print();
        p1.quadrant(p1.x, p1.y);

        Point p2 = new Point(2, 0);
        p2.print();
        p2.quadrant(p2.x, p2.y);
    }
}
