package Lesson3;

public class Task6 {
    public static void main(String[] args) {
        String email = "john_smith@example.com";
        String login = email.substring(0,email.indexOf("@")).toUpperCase().replaceAll("[._-]", " ");
        String domen = email.substring(email.indexOf("@")+1,email.length());
        System.out.println("login = \"" + login + "\"");
        System.out.println("domen = \"" + domen + "\"");
    }
}
