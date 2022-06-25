package com.company.Builder;

public class DefaultUserBuilder implements UserBuilder{
    private int uid;
    private String name;
    private String tier;

    public User build(){
        return new User(uid, name, tier);
    }

    @Override
    public UserBuilder uid(int uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder tier(String tier) {
        this.tier = tier;
        return this;
    }
}
