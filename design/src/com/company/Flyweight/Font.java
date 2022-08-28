package com.company.Flyweight;

// 플라이웨이트 > immutable : 공유하는 데이터이기 때문에 바뀌면 안됨
// 변하지 않는 속성
public final class Font {
    final String name;
    final int size;


    public Font(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }

}
