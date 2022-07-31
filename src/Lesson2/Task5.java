package Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 10);
        System.out.println(n);
        int fact = 1;
        for (int i = n; i > 0; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
