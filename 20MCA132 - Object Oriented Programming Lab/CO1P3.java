import java.util.Scanner;
class Complex{
	int real, imaginary;
	public void addComplex(Complex c){
		System.out.println("Sum:"+(c.real+real)+"+"+(c.imaginary+imaginary)+"i");
	}
}

public class CO1P3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		System.out.print("Enter the Real Number:");
		c1.real = sc.nextInt();
		System.out.print("Enter the Imaginary Number:");
		c1.imaginary = sc.nextInt();
		System.out.print("Enter the Real Number:");
		c2.real = sc.nextInt();
		System.out.print("Enter the Imaginary Number:");
		c2.imaginary = sc.nextInt();
		System.out.println("Complex No. :"+c1.real+"+"+c1.imaginary+"i");
		System.out.println("Complex No. :"+c2.real+"+"+c2.imaginary+"i");
		c2.addComplex(c1);
	}
}