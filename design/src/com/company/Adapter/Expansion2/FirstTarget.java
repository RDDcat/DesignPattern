package com.company.Adapter.Expansion2;

import com.company.Adapter.Target;

public class FirstTarget implements Target {
    @Override
    public void execute() {
        System.out.println("첫번째 타겟 실행");
    }
}
