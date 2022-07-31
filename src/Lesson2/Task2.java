package Lesson2;

public class Task2 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int r = (int) (Math.random() * 10);
        int rect = a * b;
        double circle = Math.PI * Math.pow(r,2);
        System.out.println("Площа прямокутника зі сторонами а = " + a + " та b = " + b + " дорівнює " + rect);
        System.out.println("Площа кола з радіусом r = " + r + " дорівнює " + circle);
    }
}
