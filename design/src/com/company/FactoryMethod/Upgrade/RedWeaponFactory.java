package com.company.FactoryMethod.Upgrade;

import com.company.FactoryMethod.RedWeapon;
import com.company.FactoryMethod.Weapon;
import com.company.FactoryMethod.WeaponFactory;

public class RedWeaponFactory extends DefaultWeaponFactory  {
    @Override
    public Weapon createWeapon() {
        return new RedWeapon();
    }
}
