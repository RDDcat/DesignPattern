package com.company;

import com.company.Singleton.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton4.getInstance());
        System.out.println(Singleton5.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton4.getInstance());
        System.out.println(Singleton5.getInstance());
    }
}
