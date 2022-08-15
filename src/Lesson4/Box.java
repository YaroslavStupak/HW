package Lesson4;
/*
Create a simple class with some fields.
Demonstrate in your class how we can use initialization blocks.
 */
public class Box {
    {
        System.out.println("Box is on the table");
    }
    public Box() {
        System.out.println("Box opened");
    }
    public Box(int x) {
        System.out.println("Putting things into the box");
    }

    public static void main(String arr[]) {
        Box obj1, obj2;
        obj1 = new Box();
        obj2 = new Box(0);
    }
}
