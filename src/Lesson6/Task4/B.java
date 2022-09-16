package Lesson6.Task4;

import java.io.Serializable;

public class B extends A{
    public B(int weight, int age, int height) {
        super(weight, age, height);
    }

    @Override
    public String Stats() {
        return "Stats are okay";
    }

    @Override
    public Serializable Sum() {
        return ("Stats sum is" + super.Sum());
    }
}
