package com.company.FactoryMethod.Upgrade;

import com.company.FactoryMethod.Weapon;
import com.company.FactoryMethod.WeaponFactory;

public abstract class DefaultWeaponFactory implements WeaponFactory {
    @Override
    public void sendEmailTo(String email, Weapon weapon) {
        System.out.println(weapon.getName() + " 다 만들었습니다.");
    }
}
