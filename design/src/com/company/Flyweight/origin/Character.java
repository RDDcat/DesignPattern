package com.company.Flyweight.origin;

public class Character {
    private char value;
    private String color;
    private String font;
    private int fontSize;

    public Character(char value, String color, String font, int fontSize){
        this.value = value;
        this.color = color;
        this.font = font;
        this.fontSize = fontSize;
    }
}
