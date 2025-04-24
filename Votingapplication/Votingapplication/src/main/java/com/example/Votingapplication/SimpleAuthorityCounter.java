package com.example.Votingapplication;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("simpleautoritycounter")
public class SimpleAuthorityCounter implements AuthorityCounter
{

    @PostConstruct
    public  void init()
    {
        System.out.println("DB Connections successful");
    }

    @PreDestroy
    public  void destroy()
    {
        System.out.println("Voting Has Been Closed ");
        System.out.println();
    }


    @Autowired
    private Userlist userlist;

    @Override
    public Userlist getUserList() {
        return this.userlist;
    }


}
