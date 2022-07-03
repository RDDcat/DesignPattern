package com.company.FactoryMethod;

public class Client {
    public static void main(String[] args) {

        Weapon blackWeapon = new BlackWeaponFactory().orderWeapon("검정 칼", "yukmaro@mail.com");
        System.out.println(blackWeapon);

        Weapon RedWeapon = new RedWeaponFactory().orderWeapon("빨간 방패", "yukmaro@mail.com");
        System.out.println(RedWeapon);
    }

}
