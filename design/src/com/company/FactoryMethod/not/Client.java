package com.company.FactoryMethod.not;

import com.company.FactoryMethod.Weapon;

public class Client {
    public static void main(String[] args) {
        Weapon whiteship = WeaponFactory.orderWeapon("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Weapon blackship = WeaponFactory.orderWeapon("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }
}
