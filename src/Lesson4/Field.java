package Lesson4;
/*
10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

 */
public class Field {
    public int check(int a){
        return a;
    }
    public int check(int a, int b){
        return a + b;
    }
    public String check(String a){
        return a;
    }

    public static void main(String[] args) {
        Field test = new Field();
        System.out.println(test.check(10));
        System.out.println(test.check(25,40));;
        System.out.println(test.check("Hello World!"));
    }
}
