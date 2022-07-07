package com.company.Adapter.Expansion;

import com.company.Adapter.Adaptee;

public class SecondAdaptee implements Adaptee {
    @Override
    public void play() {
        System.out.println("두번째 어댑티 호출됨");
    }
}
