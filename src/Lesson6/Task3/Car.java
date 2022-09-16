package Lesson6.Task3;

public class Car extends Vehicle {

    int currentGear;

    public Car(String name, String size) {
        super(name, size);
    }

    public void changeGear(int gear) {
        if (gear > 0 && gear < 6) {
            currentGear = gear;
        } else {
            System.out.println("Unable to change the gear");
        }
    }

    public void changeSpeed(int speed) {
        if (speed > currentGear * 20) {
            System.out.println("Unable to speed up, need to change gear first");
        } else {
            move(speed, getCurrentDirection());
        }
    }

    @Override
    public void move(int velocity, int direction) {
        if (velocity > currentGear * 20){
            System.out.println("Unable to set speed, need to change gear first");
        } else {
            super.move(velocity, direction);
        }
    }
}
