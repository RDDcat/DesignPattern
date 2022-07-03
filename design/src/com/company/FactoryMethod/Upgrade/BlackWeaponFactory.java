package com.company.FactoryMethod.Upgrade;

import com.company.FactoryMethod.BlackWeapon;
import com.company.FactoryMethod.Weapon;
import com.company.FactoryMethod.WeaponFactory;

public class BlackWeaponFactory extends DefaultWeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new BlackWeapon();
    }
}
