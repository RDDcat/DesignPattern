package com.company.Builder;

public interface UserBuilder {

    public UserBuilder uid(int uid);
    public UserBuilder name(String name);
    public UserBuilder tier(String tier);
    public User build();

}
