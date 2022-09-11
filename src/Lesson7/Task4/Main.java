package Lesson7.Task4;

public class Main {
    public static void main(String[] args) {
        TVDevice TV = new TV();
        RemoteController rc = new RemoteController();
        rc.connectDevice(TV);
        
    }
}
