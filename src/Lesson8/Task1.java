package Lesson8;
/*
Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception.
 */
public class Task1 {
    void method(int number) throws EqualsZeroException {
        if (number < 0){
            System.out.println("Number < 0");
        } else if (number == 0){
            throw new EqualsZeroException("Number is equal to zero");
        } else {
            System.out.println("Number > 0");
        }
    }

    public static void main(String[] args) {
        Task1 a = new Task1();
        a.method(20);
        a.method(-10);
    }
}
