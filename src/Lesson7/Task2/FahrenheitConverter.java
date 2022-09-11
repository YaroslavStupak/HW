package Lesson7.Task2;

public class FahrenheitConverter implements Converter{
    public void convert(double celcius) {
        System.out.println(celcius*9/5+32);
    }

    public static void main(String[] args) {
        FahrenheitConverter calculator = new FahrenheitConverter();
        calculator.convert(92);
    }
}
