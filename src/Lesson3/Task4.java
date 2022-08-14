package Lesson3;

import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        String string = "ABCDEFGHIJK";
        String newstring = string.toLowerCase(Locale.ROOT).replaceAll( "[aeiou]", "");
        System.out.println(newstring);
    }
}
