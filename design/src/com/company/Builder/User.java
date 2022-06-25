package com.company.Builder;

public class User {
    private int uid;
    private String name;
    private String tier;

    public User(int uid, String name, String tier){
        this.uid = uid;
        this.name = name;
        this.tier = tier;

    }
    public void Show(){
        System.out.println(uid);
        System.out.println(name);
        System.out.println(tier);

    }
}
