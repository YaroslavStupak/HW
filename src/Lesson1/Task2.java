package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int a = 100; //Якщо перевищити максимальне значення в 2147483647 отримаємо помилку "java: integer number too large"
        long b = 200L;
        short c = 10;
        byte d = 125;
        float e = 20.4F;
        double f = 1.544e2;
        char g = 86;
        boolean h = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}