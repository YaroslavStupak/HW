package Lesson3;

public class Task8 {
    public static void main(String[] args) {
        String credit = "1234 5678 9012 3456";
        String hidden = credit.substring(0, 14).replaceAll("[1234567890]", "*") + credit.substring(14);
        System.out.println(hidden);
    }
}
