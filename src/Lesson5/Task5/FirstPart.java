package Lesson5.Task5;
/*
Answer the question: What is a private access? Create a simple program to demonstrate the private access.
Tips:
 - Create two classes
 - In on of them create private members
 - In the second class create an object of the first class
 - Try to access the private members
 */
public class FirstPart {
    public int weight;
    public int age;
    public int height;

    private FirstPart(int weight, int age, int height) {
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    private int getsumm() {
        return weight+age+height;
    }
}
