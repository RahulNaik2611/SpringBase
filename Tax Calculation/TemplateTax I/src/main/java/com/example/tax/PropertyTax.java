package com.example.tax;

public class PropertyTax implements Tax
 
{
  
    
    private int propertyValue;
    private double taxAmount;
    private boolean isTaxPayed = false;

    @Override
    public void setTaxableAmount(int amount) {
        this.propertyValue = amount;
    }

    @Override
    public void calculateTaxAmount() {
        taxAmount = propertyValue * 0.05;
    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "property";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        isTaxPayed = true;
        System.out.println("Hi, your property tax is paid.");
    }
}
