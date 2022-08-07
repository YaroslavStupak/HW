package Lesson3;

public class Task3 {
    public static void main(String[] args) {
        String word1 = "The End";
        String word2 = "End The";
        String check = "The";
        if (word1.startsWith(check) == true) {
            System.out.println("word1 starts with " + check);
        } else  {
            System.out.println("word1 doesn't starts with " + check);
        }
        if (word2.startsWith(check) == true) {
            System.out.println("word2 starts with " + check);
        } else  {
            System.out.println("word2 doesn't starts with " + check);
        }
    }
}
