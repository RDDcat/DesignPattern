package com.company.FactoryMethod;

public interface WeaponFactory {
    default Weapon orderWeapon(String name, String email){
        validate(name, email);
        prepareFor(name);
        Weapon weapon = createWeapon();
        sendEmailTo(email, weapon);
        return weapon;
    }

    void sendEmailTo(String email, Weapon weapon);

    Weapon createWeapon();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("무기 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
