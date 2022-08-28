package com.company.Flyweight;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "black", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "black", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('y', "black", fontFactory.getFont("nanum:12"));
    }
}
