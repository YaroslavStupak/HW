package Lesson4;
/*
Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
 */
public class Human {
    public String firstName;
    public String lastName;
    public int weight;
    public int age;
    public int height;

    public Human(String firstName, String lastName, int weight, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format(firstName + " " + lastName + " is " + age + " years old, his weight is " + weight + " kg and his height is " + height + " cm");
    }

    public static void main(String[] args) {
        Human bob = new Human("Bob", "Smith", 80, 35, 183);
        System.out.println(bob.toString());
    }
}
