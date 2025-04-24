package com.example.Votingapplication;

import org.springframework.stereotype.Component;

@Component("independent")
public class Independent implements PoliticalParty
{
    private String partyName = "Independent";
    @Override
    public String getPartName() {
        return this.partyName;
    }
}
