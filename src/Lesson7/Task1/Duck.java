package Lesson7.Task1;

public class Duck implements Flyable {
    public void fly() {
        System.out.println("Duck flew away");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
    }
}
