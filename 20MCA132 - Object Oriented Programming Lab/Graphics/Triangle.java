package Graphics;
public class Triangle implements Shape{
    double b, h;
    public Triangle(double base, double height){
        b = base;
        h = height;
    }
    public double area() {
        return 0.5*b*h;
    }
}
