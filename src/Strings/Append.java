package Strings;

public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Md");

        sb.append(" Salauddin");
        System.out.println(sb);

        sb.append(22);
        System.out.println(sb);

        sb.append('n');
        System.out.println(sb);

        char[] arr = {' ', 'i', 's'};
        sb.append(arr);
        System.out.println(sb);

        sb.deleteCharAt(14);
        System.out.println(sb);

        sb.insert(12, ' ');
        System.out.println(sb);
    }
}
