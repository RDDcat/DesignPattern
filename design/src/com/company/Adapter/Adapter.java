package com.company.Adapter;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void execute() {
        adaptee.play();
    }
}
