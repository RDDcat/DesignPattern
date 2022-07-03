package com.company.FactoryMethod.Upgrade;

import com.company.FactoryMethod.BlackWeaponFactory;
import com.company.FactoryMethod.RedWeaponFactory;
import com.company.FactoryMethod.WeaponFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new BlackWeaponFactory(),  "검정 칼", "yukmaro@mail.com");
        client.print(new RedWeaponFactory(), "빨간 방패", "yukmaro@mail.com");
    }

    private void print(WeaponFactory weaponFactory, String name, String email) {
        System.out.println(weaponFactory.orderWeapon(name, email));
    }
}
