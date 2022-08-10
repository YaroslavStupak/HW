package Lesson2;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            array[i] =(int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length - 1; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
