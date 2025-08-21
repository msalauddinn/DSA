package Methods;

public class Return {
    public static int rafter(int x){
        System.out.println("Badshah");
        if (x < 15) return x;
        System.out.println("Gian");
        return x * x;
    }
    public static void main(String[] args) {
        System.out.println(rafter(10));
    }
}