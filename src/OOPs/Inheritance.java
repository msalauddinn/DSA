package OOPs;

class Animals {
    String color;
    String name;
    int weight;
}
class Bird extends Animals{
    int altitude;
}
    // IN JAVA MULTIPLE INHERITANCE NOT ALLOWED
class AquaticAnimal extends Animals {
    int fins;
}
class Fish extends AquaticAnimal { // Multilevel Inheritance
    int gills;
    int scales;
}
public class Inheritance {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.altitude = 333;
        b1.color = "White";
        b1.name = "Dove";

        Fish f = new Fish();
        f.gills = 2;

        AquaticAnimal aq1 = new AquaticAnimal();
        aq1.name = "Rui"; // Multilevel Inheritance
    }
}
