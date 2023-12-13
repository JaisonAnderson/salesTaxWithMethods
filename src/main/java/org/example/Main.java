package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Setup any variables you need and call your methods
       * here in the main method */
        final double countyTaxRate = 0.02;
        final double stateTaxRate = 0.04;
        double price = inputPurchasePrice();
        double calculateStateTax = calculateTax(price, stateTaxRate);
        double calculateCountyTax = calculateTax(price, countyTaxRate);
        double purchasePrice = calculateTax(price,calculateCountyTax);
        double totalPrice = calculateTotal(calculateCountyTax,calculateStateTax);
        displayTotals(totalPrice,calculateStateTax,calculateCountyTax,purchasePrice,totalPrice);


    }

    /* Write a method called inputPurchasePrice that
    *  takes the user input for price, converts to
    *  a double, and returns the price as a double
    * */

    public static double inputPurchasePrice(){
        Scanner userInputPrice = new Scanner(System.in);
        System.out.println("Enter Price");
        double price = Double.parseDouble(userInputPrice.nextLine());
        return price;

    }

    /* Write a method called calculateTax that
     * accepts a double called price and a double called
     * tax rate as parameters and calculates and returns the tax
     * */
    public static double calculateTax(double price, double taxRate){

        double purchasePrice = price * taxRate;
        return purchasePrice;
    }

    /* Write a method called calculateTotal that
     * accepts two double values and returns the sum
     * */

    public static double calculateTotal(double calculateCountyTax, double calculateStateTax){
            double totalPrice = calculateCountyTax + calculateStateTax;
            return totalPrice;
    }

    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as double parameters. Output using decimal formatter amd printf */

    public static void displayTotals(double purchasePrice, double stateTax, double countyTax, double totalTax, double totalPrice){
            System.out.println(purchasePrice);
            System.out.println(stateTax);
            System.out.println(countyTax);
            System.out.println(totalTax);
            System.out.println(totalPrice);
    }
}