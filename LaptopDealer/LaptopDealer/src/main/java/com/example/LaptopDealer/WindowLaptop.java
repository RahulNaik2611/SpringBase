package com.example.LaptopDealer;

public class WindowLaptop implements laptopBrand
{
    processors processor;

    public WindowLaptop(processors processor)
    {
        this.processor = processor;
    }


    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("You have Selected the Window Laptop" + processor.showprocessorsDetails());
        
    }
    

}
