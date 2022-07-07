package com.company.Adapter.Expansion2;

import com.company.Adapter.Adaptee;
import com.company.Adapter.Adapter;
import com.company.Adapter.DefalutAdaptee;
import com.company.Adapter.Target;

public class Client {
    public static void main(String[] args) {
        Adaptee defalutAdaptee = new DefalutAdaptee();
        Target adapter = new Adapter(defalutAdaptee);

        Target firstTarget = new FirstTarget();
        Target secondTarget = new SecondTarget();

        adapter.execute();
        firstTarget.execute();
        secondTarget.execute();
    }

/*  출력문
    기본 어댑티 호출됨
    첫번째 타겟 실행
    2번째 타겟 실행
*/
}
