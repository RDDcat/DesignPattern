package com.company.Prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Data data1 = new Data(1, "1번 데이터");
        Data data2 = new Data(2, "2번 데이터");

        Data clone = (Data) data1.clone();


        System.out.println(data1.getId()+", "+ data1.getTitle());
        System.out.println(clone.getId()+", "+ clone.getTitle());
        System.out.println(clone!=data1);
        System.out.println(clone.getClass() ==data1.getClass());

    }
}
