package com.example.Votingapplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class SimpleUser implements Users
{
    private String UserName;

    private PoliticalParty politicalParty;
    @Override
    public PoliticalParty getPoliticalparty() {
        return this.politicalParty;
    }

    @Override
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Override
    public String getUserName() {
        return this.UserName;
    }

    @Override
    public void setPoliticalparty(PoliticalParty politicalparty)
    {
        this.politicalParty = politicalparty;
    }
}
