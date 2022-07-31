package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int a =(int)(Math.random() * 10);;
        int b =(int)(Math.random() * 10);
        System.out.println("а = "+ a + " b = " + b);
        System.out.println("Сума a та b = " + (a+b));
        System.out.println("Різниця a та b = " + (a-b));
        System.out.println("Добуток a та b = " + (a*b));
        System.out.println("Частка a та b = " + (double)(a)/b);
    }
}
