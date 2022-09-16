package Lesson6.Task4;

import java.io.Serializable;

public class A {
    public int weight;
    public int age;
    public int height;

    public A(int weight, int age, int height) {
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public String Stats() {
        return String.format("Age: " + age + ", Weight: " + weight + ", Height: " + height);
    }

    public Serializable Sum() {
        return age+weight+height;
    }
}
