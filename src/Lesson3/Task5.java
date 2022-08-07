package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hop";
        if (string1.length() > string2.length()) {
            System.out.println(string2 + string1 + string2);
        }  else {
            System.out.println(string1 + string2 + string1);
        }
    }
}
