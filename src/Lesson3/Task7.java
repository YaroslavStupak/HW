package Lesson3;

public class Task7 {
    public static void main(String[] args) {
        String string = "Den, John, Will, Kate, Adam, Robin";
        String[] names = string.split(", ");
        for (int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
