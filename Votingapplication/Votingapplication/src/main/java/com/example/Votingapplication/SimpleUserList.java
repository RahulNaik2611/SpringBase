package com.example.Votingapplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("userlist")
public class SimpleUserList implements  Userlist
{
    List<Users> listofUser;

    public SimpleUserList() {

        this.listofUser = new ArrayList<>();
    }

    @Override
    public void addUser(Users user) {
        listofUser.add(user);
    }

    @Override
    public List<Users> getUserList() {
        return this.listofUser;
    }
}
