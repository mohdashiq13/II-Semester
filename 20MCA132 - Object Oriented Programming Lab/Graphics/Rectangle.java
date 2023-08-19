package Graphics;
public class Rectangle implements Shape {
    double len, bre;
    public Rectangle(double length, double breadth){
        len = length;
        bre = breadth;
    }
    public double area() {
        return len*bre;
    }
}
