import Graphics.*;
import Graphics.Circle;
import Graphics.Rectangle;

public class CO4P1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(10, 20);
        Square s = new Square(20);
        Circle c =new Circle(30);

        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Area of Triangle: "+t.area());
        System.out.println("Area of Square: "+s.area());
        System.out.println("Area of Circle: "+c.area());

    }
}
