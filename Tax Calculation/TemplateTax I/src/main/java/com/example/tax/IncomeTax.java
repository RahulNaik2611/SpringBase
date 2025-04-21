package com.example.tax;

public class IncomeTax  implements Tax
{
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */

    
     private int taxableAmount;
     private double taxAmount;
     private boolean isTaxPayed = false;
 
     @Override
     public void setTaxableAmount(int amount) {
         this.taxableAmount = amount;
     }
 
     @Override
     public void calculateTaxAmount() {
         if (taxableAmount <= 250000) {
             taxAmount = 0;
         } else if (taxableAmount <= 500000) {
             taxAmount = (taxableAmount - 250000) * 0.05;
         } else if (taxableAmount <= 1000000) {
             taxAmount = (250000 * 0.05) + (taxableAmount - 500000) * 0.20;
         } else {
             taxAmount = (250000 * 0.05) + (500000 * 0.20) + (taxableAmount - 1000000) * 0.30;
         }
     }
 
     @Override
     public double getTaxAmount() {
         return taxAmount;
     }
 
     @Override
     public String getTaxType() {
         return "income";
     }
 
     @Override
     public boolean isTaxPayed() {
         return isTaxPayed;
     }
 
     @Override
     public void payTax() {
         isTaxPayed = true;
         System.out.println("Hi, your income tax is paid.");
     }

}
