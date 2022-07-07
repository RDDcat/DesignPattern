package com.company.Adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee defalutAdaptee = new DefalutAdaptee();
        Target adapter = new Adapter(defalutAdaptee);
        adapter.execute();
    }
/*  출력문
    기본 어댑티 호출됨
*/

}
