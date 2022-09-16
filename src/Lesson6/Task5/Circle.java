package Lesson6.Task5;

public class Circle extends Figure{
    public Circle(int width) {
        super(width);
    }

    @Override
    public double calculateArea() {
        return width * width * Math.PI;
    }
}
