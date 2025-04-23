package com.example.SocialMedia;

public class SimplePost implements Post
{

    String message = " ";
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return message;
    }

    @Override
    public void setMessage(String Msg) {
        // TODO Auto-generated method stub
        this.message = Msg;
        
    }
    
}
