package OOPs;
class Mobile {
    // these are attributes of Mobile class

    String name;
    int price;
    int megapixel;
    double screenSize;
    int battery;

    void print() {
        System.out.println(name + " : " + price);
    }

}
public class MethodsInsideAClass {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.battery = 5700;
        m1.name = "Vivo T4R";
        m1.megapixel = 50;
        m1.price = 19499;
        m1.screenSize = 6.77;
        m1.print();

        Mobile m2 = new Mobile();
        m2.battery = 4000;
        m2.name = "Redmi Note 7 pro";
        m2.megapixel = 48;
        m2.price = 16999;
        m2.screenSize = 6.3;
        m2.print();
    }
}
