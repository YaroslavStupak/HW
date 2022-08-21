package Lesson5;

public class Test {
    public static void main(String[] args) {
        Task11 a = new Task11();
        Task11 b = new Task11();
        System.out.println(Task11.staticField);
        Task11.change(1);
        System.out.println(Task11.staticField);
    }
}
