package com.example.Votingapplication;

import org.springframework.stereotype.Component;

@Component("democratic")
public class Democratic implements  PoliticalParty
{
    private String partyName = "Democratic";
    @Override
    public String getPartName() {
        return this.partyName;
    }
}
