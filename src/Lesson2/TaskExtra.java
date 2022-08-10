package Lesson2;

public class TaskExtra {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] =(int) (Math.random() * 50);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max2 = max1;
                max1 = array[i];
            }
        }
        System.out.println("Два найбільших числа списку " + max2 + " та " + max1);
    }
}
