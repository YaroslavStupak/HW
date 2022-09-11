package Lesson7.Task3;

public class MyDevice implements State, Volume{
    public boolean state = true;
    public double volume = 0;

    public void on(){
        if (state) {
            System.out.println("The device is already turned ON, volume is " + volume);
        } else {
            state = true;
            System.out.println("Turning on the device, volume is " + volume);
        }
    }

    public void off(){
        if (state) {
            state = false;
            System.out.println("Turning off the device");
        } else {
            System.out.println("The device is already turned off");
        }
    }

    public void changeVolume(double value){
        volume = value;
        System.out.println("Set device's volume to " + value);
    }

    public static void main(String[] args) {
        MyDevice radio = new MyDevice();
        radio.changeVolume(25.5);
        radio.on();
        radio.off();
        radio.off();
        radio.on();
    }
}
