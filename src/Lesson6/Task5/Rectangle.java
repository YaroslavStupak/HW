package Lesson6.Task5;

public class Rectangle extends Figure{
    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return height*width;
    }
}
