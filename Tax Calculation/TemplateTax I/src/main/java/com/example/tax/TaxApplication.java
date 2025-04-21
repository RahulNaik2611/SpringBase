package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
		// Take ClassPathXmlApplicationContext from applicationContext.xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
        Tax incomeTax = (Tax) context.getBean("incomeTax");
        incomeTax.setTaxableAmount(1200000);
        incomeTax.calculateTaxAmount();
        System.out.println("Income Tax Amount: ₹" + incomeTax.getTaxAmount());
        incomeTax.payTax();

        Tax propertyTax = (Tax) context.getBean("propertyTax");
        propertyTax.setTaxableAmount(6000000);
        propertyTax.calculateTaxAmount();
        System.out.println("Property Tax Amount: ₹" + propertyTax.getTaxAmount());
        propertyTax.payTax();

	}

}
