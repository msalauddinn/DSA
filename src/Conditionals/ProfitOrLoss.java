package Conditionals;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price : ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter selling price : ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice){
            double profit = sellingPrice - costPrice;
            System.out.println("Seller made profit of ₹" + profit);
        }
        else if (costPrice == sellingPrice){
            System.out.println("Seller made no profit no loss");
        }
        else {
            double loss = costPrice - sellingPrice;
            System.out.println("Seller made loss of ₹" + loss);
        }
    }
}
