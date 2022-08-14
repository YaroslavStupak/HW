package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        String string = "Hello World!";
        if (string.length() >= 2) {
            System.out.println(string.charAt(0) + "" + string.charAt(1));
        } else if (string.length() >= 1) {
            System.out.println(string.charAt(0));
        } else {
            System.out.println(" ");
        }
    }
}
