package org.saddy;

import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price details of item1: ");
        double price1 = scanner.nextDouble();
        System.out.println("Enter the quantity of item1: ");
        int quantity1 = scanner.nextInt();

        System.out.println("Enter price details of item2: ");
        double price2 = scanner.nextDouble();
        System.out.println("Enter the quantity of item2: ");
        int quantity2 = scanner.nextInt();

        double purchasePrice1 = quantity1 * price1;
        double purchasePrice2 = quantity2 * price2;
        double subTotal = purchasePrice1 + purchasePrice2;
// apply discount. discount is 10% if purchased > 100$ else 5%
        double discountRate = subTotal > 100 ? 0.10 : 0.05;
//        calculate tax: 10%
        double tax = subTotal * 0.10;
//        final purchased amount:
        double finalAmount = subTotal - (subTotal * discountRate) + tax;
        System.out.println("\nShopping Summary:");
        System.out.println("Item | Quantity | Unit Price | Total Price");
        System.out.println("Item1 | " + quantity1 + " | " + price1 + " | " + purchasePrice1);
        System.out.println("Item2 | " + quantity2 + " | " + price2 + " | " + purchasePrice2);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Discount (" + discountRate * 100 + "): " + (subTotal * discountRate));
        System.out.println("Tax (10%): " + tax);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}
