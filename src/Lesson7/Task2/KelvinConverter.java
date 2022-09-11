package Lesson7.Task2;

public class KelvinConverter {
    public void convert(double celcius) {
        System.out.println(celcius+273.15);
    }

    public static void main(String[] args) {
        KelvinConverter calculator = new KelvinConverter();
        calculator.convert(92);
    }
}
