package Lesson2;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        double[] sqarray = new double[10];
        for (int i = 0; i < array.length; i++){
            array[i] =(int) (Math.random() * 100);
        }
        for (int i = 0; i < sqarray.length; i++){
            sqarray[i] = Math.sqrt((double) (array[i]));
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(sqarray[i]);
        }
    }
}
