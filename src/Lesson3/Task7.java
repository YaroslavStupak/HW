package Lesson3;

public class Task7 {
    public static void main(String[] args) {
        String string = "Den, John, Will, Kate, Adam, Robin";
        char[] cstring = string.toCharArray();
        for (int i = 0; i < cstring.length; i++) {
            if ((int)(cstring[i]) == 44) {
                System.out.println();
            } else if ((int)(cstring[i]) == 32) {
                continue;
            } else {
                System.out.print(cstring[i]);
            }
        }
    }
}
