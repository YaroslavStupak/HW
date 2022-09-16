package Lesson6.Task5;

public class Triangle extends Figure{

    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * width;
    }
}
