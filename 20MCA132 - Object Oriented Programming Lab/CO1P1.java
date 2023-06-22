class Product{
	String pName;
	int pCode,price;
}

public class CO1P1{
	public static void main(String []args){
		Product p1 = new Product();
		p1.pCode = 101;
		p1.pName = "Laptop";
		p1.price = 68700;
		
		Product p3 = new Product();
		p3.pCode = 103;
		p3.pName = "Keyboard";
		p3.price = 500;
		
		Product p2 = new Product();
		p2.pCode = 102;
		p2.pName = "Mouse";
		p2.price = 450;
		
		Product lowest = p1;
		if(p2.price < lowest.price)
			lowest = p2;
		if(p3.price < lowest.price)
			lowest = p3;
		System.out.println("Least Priced Product:-");
		System.out.println("Product Name: "+lowest.pName);
		System.out.println("Product Price: "+lowest.price);
		System.out.println("Product Code: "+lowest.pCode);
	}
}