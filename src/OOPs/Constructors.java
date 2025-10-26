package OOPs;
class Animal {
    int legs;
    String type;

    // same name but working multiple purpose this is called constructor overloading
    Animal() { // Default Constructor (1)

     }
    Animal(int l, String t) { // Parameterise Constructor (2)
        legs = l;
        type = t;
    }
    Animal(String t, int l) { // Parameterise Constructor (3)
        legs = l;
        type = t;
    }
    Animal (String t) {
        type = t;
    }
    Animal (int l) {
        legs = l;
    }
    void print() {
        System.out.println(type + " : " + legs);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Animal a1 = new Animal("Human", 2); // this is called Constructor call without return type
        a1.print();

        Animal a = a1; // shallow copy;

        // Animal a2 = new Animal(4, "Tiger");
        Animal a2 = new Animal(); // ERROR but if we create the default constructor inside the class it'll correct
        a2.type = "Tiger";
        a2.legs = 4;
        a2.print();

        Animal a3 = new Animal(8, "Octopus");
        a3.print();

        Animal a4 = new Animal("Ostrich");
        a4.legs = 2;
        // a4.type = "Cow"; we can update also
        a4.print();

        Animal a5 = new Animal(1);
        a5.type = "Owl";
        a5.print();
    }
}
