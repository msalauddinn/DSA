package Strings;

public class SumOfAllSubstringOfANumber {
    public static void main(String[] args) {
        String str = "7134";

        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j <= str.length(); j++){
                int n = Integer.parseInt(str.substring(i, j));
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
