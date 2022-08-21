package Lesson4;
/*
Write your own example of the recursive function. You can find a lot of examples on the Internet.
 */
public class Recursive {
    public int factorial(int n) {
        int result = 1;
        if (n == 1){
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }

    public static void main(String[] args) {
        Recursive test = new Recursive();
        System.out.println(test.factorial(25));
    }
}
