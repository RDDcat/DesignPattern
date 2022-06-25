package com.company.Singleton;

public class Singleton5 {

    private Singleton5(){}

    public static Singleton5 getInstance() {
        return Singleton5Holder.instance;
    }

    private static class Singleton5Holder {
        private static final Singleton5 instance = new Singleton5();
    }
}
