import java.util.Scanner;

interface Areas{
    public void area();
    public void perimeter();
}

class Circle implements Areas{
    float radius;
    Circle(int x){
        radius = x;
    }
    public void area() {
        System.out.println("Area (Circle): "+(3.14*radius*radius));
    }
    public void perimeter() {
        System.out.println("Perimeter (Circle): "+(2*3.14*radius));
    }
}

class Rectangle implements Areas{
    int length, breadth;
    Rectangle(int a, int b){
        length = a;
        breadth = b;
    }
    public void area() {
        System.out.println("Area (Rectangle): "+(length*breadth));
    }
    public void perimeter() {
        System.out.println("Perimeter (Rectangle): "+(2*(length+breadth)));
    }
}

public class CO3P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel;
        System.out.println("Area and Perimeter of:-");
        System.out.println("Press 1 for Circle.");
        System.out.println("Press 2 for Rectangle.");
        sel = sc.nextInt();
        switch (sel){
            case 1: Circle c =new Circle(10);
                    c.area();
                    c.perimeter();
                    break;
            case 2: Rectangle r = new Rectangle(10, 20);
                    r.area();
                    r.perimeter();
                    break;
            default:
                System.out.println("Wrong Command");
        }
    }
}
