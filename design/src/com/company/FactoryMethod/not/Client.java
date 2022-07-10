package com.company.FactoryMethod.not;

import com.company.FactoryMethod.Weapon;

public class Client {
    public static void main(String[] args) {
        Weapon blackWeapon = WeaponFactory.orderWeapon("blackWeapon", "mail.com");
        System.out.println(blackWeapon);

        Weapon redWeapon = WeaponFactory.orderWeapon("redWeapon", "mail.com");
        System.out.println(redWeapon);
    }
}
