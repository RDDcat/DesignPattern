package com.company.Singleton;

public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }
}
