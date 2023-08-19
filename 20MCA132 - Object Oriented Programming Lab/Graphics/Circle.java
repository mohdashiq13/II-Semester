package Graphics;
public class Circle implements Shape{
    double rad;
    public Circle(double radius){
        rad = radius;
    }
    public double area() {
        return 3.14*rad*rad;
    }
}
