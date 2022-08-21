package Lesson4;
/*
2. Implement the method fight() depending on weight, strength and age of the boxer:
You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
*/

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        return (weight + strength - age > anotherBoxer.weight + anotherBoxer.strength - anotherBoxer.age);
    }

    public static void main(String[] args) {
        Boxer mike = new Boxer(25, 78, 20);
        Boxer bob = new Boxer(35, 80, 15);
        System.out.println(mike.fight(bob));
        System.out.println(bob.fight(mike));
    }
}
