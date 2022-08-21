package Lesson4;
/*
Create a class StaticCalculator. It should have three fields: double firstValue, double secondValue and String operation.
Create all required constructors to properly initialize your object.
Consider the case when user does not provide any parameters when creates a new object.
Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
Write the test class which contains the main method.
In this main method you should create your StaticCalculator object and do some calculation to test your code,
by calling your "calculate" method.
Print all results to the console.
 */
import java.io.Serializable;

public class StaticCalculator {
    public double firstValue;
    public double secondValue;
    public String operation;

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public Serializable calculate() {
        int i = operation.charAt(0);
        switch (i){
            case 43:
                return firstValue + secondValue;
            case 42:
                return firstValue * secondValue;
            case 45:
                return firstValue - secondValue;
            case 47:
                return firstValue / secondValue;
            case 37:
                return firstValue % secondValue;
            default:
                return "Incorrect operation value";
        }
    }
}
