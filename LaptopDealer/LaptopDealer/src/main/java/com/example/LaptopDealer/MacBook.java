package com.example.LaptopDealer;

public class MacBook implements laptopBrand
{
    processors processor;

 

    public MacBook(processors processor)
    {
        this.processor = processor;
    }







    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("You have selected the MacBook"+ processor.showprocessorsDetails());
        
    }
    

}
