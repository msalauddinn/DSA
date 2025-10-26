package OOPs;
class Fraction {
    int numerator;
    int denominator;
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    void print() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    void simplify() {
        // divide numerator and denominator by their HCF
        int hcf = gcd(numerator, denominator);
        numerator /= hcf;
        denominator /= hcf;
    }

    private int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    void add(Fraction f) {
        this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }
    void multiply(Fraction f) {
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
        simplify();
    }
    void divide(Fraction f) { // HOMEWORK
        this.numerator *= f.denominator;
        this.denominator *= f.numerator;
        simplify();
    }
    void subtract(Fraction f) { // HOMEWORK
        this.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(6, 8);
        f1.print();
        Fraction f2 = new Fraction(5, 6);
        f2.print();

//        f1.add(f2);
//        f1.print();

//        f2.multiply(f1);
//        f2.print();

//        f1.subtract(f2);
//        f1.print();

        f1.divide(f2);
        f1.print();
    }
}
