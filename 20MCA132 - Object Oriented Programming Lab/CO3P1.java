import java.lang.Math;
import java.util.Scanner;

public class CO3P1{
	static double area(double base, double height){ return (0.5*base*height); }
	static double area(double side){ return Math.pow(side,2); }
	static int area(int width, int height){ return width*height; }
	static double area(double base, double adjacent, double height){ return (0.5*(base+adjacent)*height); }
	static int selectShape(){
		int selection;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of Triangle");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of Rectangle");
		System.out.println("4.Area of Trapezium");
		System.out.print("Choice : ");
		selection = sc.nextInt();
		return selection;
	}
	static void findShape(int sel){
		Scanner sc = new Scanner(System.in);
		if(sel == 1){
			System.out.print("Base:");
			double base = sc.nextDouble();
			System.out.print("Height:");
			double height = sc.nextDouble();
			System.out.println("Area (Triangle):"+area(base, height));
		}else if(sel == 2){
			System.out.print("Side:");
			double side = sc.nextDouble();
			System.out.println("Area (Square):"+area(side));
		}else if(sel == 3){
			System.out.print("Width:");
			int width = sc.nextInt();
			System.out.print("Height:");
			int height = sc.nextInt();
			System.out.println("Area (Rectangle):"+area(width, height));
		}else if(sel == 4){
			System.out.print("Base:");
			double width = sc.nextDouble();
			System.out.print("Adjacent:");
			double adjacent = sc.nextDouble();
			System.out.print("Height:");
			double height = sc.nextDouble();
			System.out.println("Area (Trapezium):"+area(width, adjacent, height));
		}
	}
	public static void main(String []args){
		int num = selectShape();
		findShape(num);
	}
}