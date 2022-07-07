package com.company.Adapter.Expansion2;

import com.company.Adapter.Target;

public class SecondTarget implements Target {
    @Override
    public void execute() {
        System.out.println("2번째 타겟 실행");
    }
}
