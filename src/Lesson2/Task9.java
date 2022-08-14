package Lesson2;

public class Task9 {
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
        int[] srtarray = array;
        for (int i = 0; i<array.length; i++) {
            for(int j = 0; j<array.length; j++) {
                int a = srtarray[j];
                int b = srtarray[i];
                if (b < a) {
                    srtarray[j] = b;
                    srtarray[i] = a;
                }
            }
            for (int x = 0; x < srtarray.length; x++) {
                System.out.print(srtarray[x] + " ");
            }
            System.out.println();
        array = srtarray;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


    }

}
