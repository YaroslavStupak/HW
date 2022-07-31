package Lesson2;

public class Task6 {
    public static void main(String[] args) {
        int i,j;
        for (i = 0; i<8; i++) {
            for (j = 0; j<8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (i = 0; i<5; i++) {
            for (j = 0; j<8; j++) {
                if (0<i && i<4 && 0<j && j<7) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (i = 0; i<7; i++){
            for (j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (i = 0; i<5; i++) {
            for (j = 4-i; j>0;j--){
                System.out.print("  ");
            }
            for (j = 0; j<1+i*2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
