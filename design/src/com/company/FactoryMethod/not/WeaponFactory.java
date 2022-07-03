package com.company.FactoryMethod.not;

import com.company.FactoryMethod.Weapon;

public class WeaponFactory {

    public static Weapon orderWeapon(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Weapon weapon = new Weapon();
        weapon.setName(name);

        // coloring
        if (name.equalsIgnoreCase("whiteship")) {
            weapon.setColor("whiteship");
        } else if (name.equalsIgnoreCase("blackship")) {
            weapon.setColor("black");
        }

        // notify
        sendEmailTo(email, weapon);

        return weapon;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Weapon weapon) {
        System.out.println(weapon.getName() + " 다 만들었습니다.");
    }

}
