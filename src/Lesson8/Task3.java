package Lesson8;
/*
Finish the program to handle all the possible exceptions:
 */
public class Task3 {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println(new RuntimeException(e));
        }
        int[] c = {1};
        try {
            System.out.println(c[1]);
        } catch (Exception e) {
            System.out.println(new RuntimeException(e));
        }

    }
}
