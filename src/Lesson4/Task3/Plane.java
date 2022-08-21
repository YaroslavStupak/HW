package Lesson4.Task3;
 /* has-a */
public class Plane {
    Point point = new Point(4, 5);
    public String coordinates () {
        return point.coordinates();
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(plane.coordinates());
    }
}
