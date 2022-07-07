package com.company.Adapter;

public class DefalutAdaptee implements Adaptee{
    @Override
    public void play() {
        System.out.println("기본 어댑티 호출됨");
    }
}
