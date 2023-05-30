package com.Demo;

public class OoPS {
    int age;
    String name;

    public void setage(int giveage, String name1) {
        age = giveage;
        name = name1;

    }

    public void display() {
        System.out.println(age + "" + name);
    }

    public static void main(String[] args) {
        OoPS s = new OoPS();

    }
}
