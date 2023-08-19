import java.util.Scanner;

class Publisher {
    String publisherName;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String bookTitle;
    double price;

    public Book(String publisherName, String bookTitle, double price) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.price = price;
    }
}

class Literature extends Book {
    String author;

    public Literature(String publisherName, String bookTitle, double price, String author) {
        super(publisherName, bookTitle, price);
        this.author = author;
    }

    public void display() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + author);
    }
}

class Fiction extends Book {
    String author;

    public Fiction(String publisherName, String bookTitle, double price, String author) {
        super(publisherName, bookTitle, price);
        this.author = author;
    }

    public void display() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + author);
    }
}

public class CO3P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();

        Literature[] literatureBooks = new Literature[n];
        Fiction[] fictionBooks = new Fiction[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Literature book " + (i + 1) + ":");
            System.out.print("Publisher: ");
            String publisherName = scanner.next();
            System.out.print("Book Title: ");
            String bookTitle = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Author: ");
            String author = scanner.next();
            literatureBooks[i] = new Literature(publisherName, bookTitle, price, author);

            System.out.println("Enter details for Fiction book " + (i + 1) + ":");
            System.out.print("Publisher: ");
            publisherName = scanner.next();
            System.out.print("Book Title: ");
            bookTitle = scanner.next();
            System.out.print("Price: ");
            price = scanner.nextDouble();
            System.out.print("Author: ");
            author = scanner.next();
            fictionBooks[i] = new Fiction(publisherName, bookTitle, price, author);
        }

        System.out.println("Enter the category (Literature/Fiction) to display books: ");
        String category = scanner.next();

        if (category.equalsIgnoreCase("Literature")) {
            System.out.println("Literature Books:");
            for (Literature book : literatureBooks) {
                book.display();
                System.out.println();
            }
        } else if (category.equalsIgnoreCase("Fiction")) {
            System.out.println("Fiction Books:");
            for (Fiction book : fictionBooks) {
                book.display();
                System.out.println();
            }
        } else {
            System.out.println("Invalid category");
        }
    }
}
