package Lesson6.Task4;

public class Test {
    public static void main(String[] args) {
        A a = new A(90, 25,170);
        System.out.println(a.Stats());
        System.out.println(a.Sum());
        B b = new B(90, 25, 170);
        System.out.println(b.Stats());
        System.out.println(b.Sum());
    }
}
