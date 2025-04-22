package com.example.LaptopDealer;

public class Del implements laptopBrand 
{
    processors processor;

    

    public Del(processors processor) {
        this.processor = processor;
    }



    @Override
    public void showDetails() 
    {
        System.out.println("You hava selected the Del Laptop"+ processor.showprocessorsDetails());
        // TODO Auto-generated method stub
        
    }
    

}
