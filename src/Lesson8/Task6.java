package Lesson8;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program that will read numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of a number, this method should catch the exception and display all
previously entered numbers as a result. Each number should be printed from a new line preserving the order of the input.
 */
public class Task6 {
    public void readData() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                numbers.add(scanner.nextInt());
            } catch (Exception e) {
                for (Integer number : numbers) {
                    System.out.println(number);

                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Task6 a = new Task6();
        a.readData();
    }
}
