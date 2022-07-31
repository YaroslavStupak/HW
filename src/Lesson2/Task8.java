package Lesson2;

public class Task8 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i + " ");
            } else if (i % 5 == 0 && i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
