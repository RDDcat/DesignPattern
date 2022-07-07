package com.company.Adapter.Expansion;

import com.company.Adapter.Adaptee;
import com.company.Adapter.Adapter;
import com.company.Adapter.DefalutAdaptee;
import com.company.Adapter.Target;

public class Client {
    public static void main(String[] args) {
        Adaptee defalutAdaptee = new DefalutAdaptee();
        Adaptee secondAdaptee = new SecondAdaptee();

        Target adapter = new Adapter(secondAdaptee);
        adapter.execute();
    }
/*  출력문
    두번째 어댑티 호출됨
*/
}
