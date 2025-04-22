package com.example.LaptopDealer;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class LaptopDealerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LaptopDealerApplication.class, args);

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Brand you want to buy:\n1. Dell \n2 MacBook \n3. windowlaptop :  ");
		System.out.println("Select the range of (1-3)");
		int userBrandSelect = sc.nextInt();

		System.out.println("Choose the proccesor you want to choose : \n1. i3 \n2.i5 \n3. i7 ");
		System.out.println("Select the range between (1-3)");
		int userchooseprocess = sc.nextInt();

		String beanid = " ";

		switch (userBrandSelect) 
		{

			case 1:{
				switch (userchooseprocess) 
				{
					case 1:{
						beanid = "delwithi3";
						break;
					}
					case 2:{
						beanid = "delwithi5";
						break;
					}
					case 3:{
						beanid = "delwithi7";
						break;
					}
				}
				break;
			}
			case 2: {
				switch (userchooseprocess) 
				{
					case 1:{
						beanid = "macbookwithi3";
						break;

					}case 2:{
						beanid = "macbookwithi5";
						break;

					}case 3:{
						beanid = "macbookwithi6";
						break;

					}
						
						
				}
				break;
			}
			case 3: {
				switch (userchooseprocess)
				{
					case 1:{
						beanid = "windowlaptopwithi3";
						break;

					}case 2:{
						beanid = "windowlaptopwithi5";
						break;

					}case 3:{
						beanid = "windowlaptopwithi7";
						break;

					}
					
				}
			}
			default:
			System.out.println("Invalid");
				break;
		}
		laptopBrand lp = (laptopBrand) applicationContext.getBean(beanid);
		lp.showDetails();
	}

}
