interface Calculate {
    double calculateTotal();
}

class Product implements Calculate {
    int productId;
    String name;
    int quantity;
    double unitPrice;

    public Product(int pId, String nme, int qty, double uPrice) {
        productId = pId;
        name = nme;
        quantity = qty;
        unitPrice = uPrice;
    }

    public double calculateTotal() {
        return quantity * unitPrice;
    }

    public void displayProduct() {
        System.out.printf("%-7d %-6s %-9d %-10.2f %.2f%n", productId, name, quantity, unitPrice, calculateTotal());
    }
}

public class CO3P7 {
    public static void main(String[] args) {
        System.out.println("Order No.");
        System.out.println("Date :");
        System.out.println("ProductId Name    Quantity UnitPrice Total");

        Product[] products = new Product[2];
        products[0] = new Product(101, "A", 2, 25);
        products[1] = new Product(102, "B", 1, 100);

        double netAmount = 0;

        for (Product product : products) {
            product.displayProduct();
            netAmount += product.calculateTotal();
        }

        System.out.printf("Net.Amount %.2f%n", netAmount);
    }
}
