package Lesson7.Task1;

public class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flew away");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
    }
}
