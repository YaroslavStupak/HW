package Lesson6.Task5;

public abstract class Figure {
    int height;
    int width;

    public Figure(int width) {
        this.width = width;
    }
    public Figure(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract double calculateArea();
}
