package com.company.FactoryMethod;

public class BlackWeaponFactory implements WeaponFactory{

    @Override
    public void sendEmailTo(String email, Weapon weapon) {
        System.out.println(weapon.getName() + " 다 만들었습니다.");
    }

    @Override
    public Weapon createWeapon() {
        return new BlackWeapon();
    }
}
