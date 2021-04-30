package com.company;

public class UserManager {
    public void add(User user) {
        System.out.println(user.id + " " + user.getFirstName() + " "+ user.getLastName() + " eklendi");
    }

    public void addMultiple(User[] users){
        for (User user : users){
            add(user);
        }
    }
}
