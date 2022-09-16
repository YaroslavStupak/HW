package Lesson8;
/*
Fix the program to make it work
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (Exception e) {
            System.out.println(new RuntimeException(e));
        }
    }
}
