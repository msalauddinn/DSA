package Methods;

public class LocalVariables {
    public static void main(String[] args) {
        int a = 10; // a is local to main
        fun();

        /*
            for (int i = 0; i < 5; i++){ // here i is local to this for block
            System.out.println(i + " ");
            }
         */
    }
    public static void fun(){
        // System.out.println(a); // ERROR
    }
}
