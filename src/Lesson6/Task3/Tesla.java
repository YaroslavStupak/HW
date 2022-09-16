package Lesson6.Task3;

public class Tesla extends Car{
    public Tesla(String model, String size) {
        super(model, size);
    }

    public static void main(String[] args) {
        Tesla car = new Tesla("X", "4,97 m");
        car.move(20,20);
        car.changeGear(4);
        car.move(20,20);
        car.changeSpeed(81);
        car.changeGear(5);
        car.changeSpeed(81);
    }
}
