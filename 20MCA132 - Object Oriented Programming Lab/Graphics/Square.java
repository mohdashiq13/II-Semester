package Graphics;
public class Square implements Shape{
    double si;
    public Square(double side){
        si = side;
    }
    public double area() {
        return si*si;
    }
}
