package Lesson3;

public class Task8 {
    public static void main(String[] args) {
        String credit = "1234 5678 9012 3456";
        char[] ccredit = credit.toCharArray();
        for (int i = 0; i < credit.length(); i++) {
            if ((int)(ccredit[i]) == 32) {
                System.out.print(" ");
            } else if (i > credit.length() - 5) {
                System.out.print(ccredit[i]);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
