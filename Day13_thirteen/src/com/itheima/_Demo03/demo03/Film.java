package com.itheima._Demo03.demo03;

public class Film {

    private String name;

    public Film() {
    }

    public Film(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }
}
