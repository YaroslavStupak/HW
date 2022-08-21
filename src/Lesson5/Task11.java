package Lesson5;

public class Task11 {
    static int staticField;
    int dynamicField;

    static void change(int value) {
        staticField = value;
    }

    void anotherChange(int value) {
        this.dynamicField = value;
    }
}
