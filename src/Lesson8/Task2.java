package Lesson8;
/*
Fix the method with try-catch to get the correct result of division
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("It is not possible to divide by zero");
            return 0;
        }
    }
}
