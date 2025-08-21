package Methods;

public class GlobalVariables {
    static int x = 9; // x is global variable
    public static void main(String[] args) {
        System.out.println(x);
        eva();
        int x = 15;
        System.out.println(x);
    }
    public static void eva(){
        x = 12;
    }
}
