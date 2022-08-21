package Lesson4.Task3;
/* uses-a */
public class Line {
    public int xPose1;
    public int xPose2;
    public int yPose1;
    public int yPose2;

    public Line(Point somePoint1, Point somePoint2) {
        this.xPose1 = somePoint1.xPos;
        this.xPose2 = somePoint2.xPos;
        this.yPose1 = somePoint1.yPos;
        this.yPose2 = somePoint2.yPos;
    }
}

