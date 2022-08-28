package com.company.Prototype;

public class Data implements Cloneable {
    private int id;
    private String title;

    public Data(int id, String title) {

        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
