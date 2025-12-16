package com.techwithedward.Classes;

public class Person {
    // encapsulating the class fields using private access modifier
    private String name;
    private int age;

    // Setter to get field's value
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    // setter to set the private class fields
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
