package Lesson5.Task1;

/*
Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
Create a third class with the main method.
In the main method create two different objects of your classes specifying the full name of the classes (including packages).
 */

public class Third {
    public static void main(String[] args) {
        Lesson5.Task1.First.Task1 a = new Lesson5.Task1.First.Task1();
        Lesson5.Task1.Second.Task1 b = new Lesson5.Task1.Second.Task1();
    }
}
