package Lesson5;
/*
Create a new class. Add 5 private fields. Add getter and setters to all the fields.
 */
public class Task8 {
    private String name;
    private int height;
    private int width;
    private int length;
    private int speed;

    public Task8 (String name, int height, int width, int length, int speed){
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
