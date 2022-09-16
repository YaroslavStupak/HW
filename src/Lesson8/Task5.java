package Lesson8;
/*
Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
 */
public class Task5 {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (Exception e) {
            System.out.println(new RuntimeException(e));
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}
