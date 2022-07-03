package com.company.Command.not;

public class House {
    private Light light;

    public House(Light light){
        this.light = light;
    }

    public void press(){
        light.on();
    }
    public static void main(String[] args) {
        House house = new House(new Light());
        house.press();
        house.press();
    }
}
