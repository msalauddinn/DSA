package OOPs;

class Baccha{
    static String hobby = "Coding";
    String name;
    int rno;
    double cgpa;

    Baccha (String name, int rno, double cgpa) {
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    void print() {
        System.out.println(name + "  " + rno + "  " + cgpa);
    }
    static void greet() {
        System.out.println("Good Morning");
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Baccha b1 = new Baccha("Salauddin", 22, 7.3);
        b1.print();
        System.out.println(Baccha.hobby);

        Baccha b2 = new Baccha("Sakil", 9, 7.5);
        b2.print();
        Baccha.hobby = "Cricket";

        System.out.println(Baccha.hobby);
        // changing in b2 is also changed the hobby of b1 because the hobby is a sharable data of the class Baccha
        // so anyone can control the hobby
        Baccha.greet();
    }
}
