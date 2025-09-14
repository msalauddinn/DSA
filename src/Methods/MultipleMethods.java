package Methods;

public class MultipleMethods {
    public static void main(String[] args) {
        navid();
        toumik();
    }
    public static void navid(){
        System.out.println("Sakil");
    }
    public static void eva(){
        toumik();
        System.out.println("Aditya");
    }
    public static void toumik(){
        System.out.println("Razi");
        eva();
    }
}
