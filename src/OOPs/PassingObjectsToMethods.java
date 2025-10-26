package OOPs;

class Car{
    String name;
    String color;
    int seats;
    int power;
}
public class PassingObjectsToMethods {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.color = "Yellow";
        car1.power = 118;
        car1.seats = 2;

        System.out.println(car1.seats);
        System.out.println(car1.color);

        change(car1);

        System.out.println(car1.seats);
        System.out.println(car1.color);
    }

    private static void change(Car car) { // car is shallow copy of car1;
        // that's why it changes the things, and also you can say here happening call by reference like array
        car.color = "Black";
        car.seats = 3;
    }
}
