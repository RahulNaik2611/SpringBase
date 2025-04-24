package com.example.Votingapplication;


import org.springframework.stereotype.Component;

@Component("republic")
public class Republic implements PoliticalParty
{
    private String partyName = "Republic";
    @Override
    public String getPartName() {
        return this.partyName;
    }
}
