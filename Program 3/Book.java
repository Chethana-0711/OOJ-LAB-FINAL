import java.util.*;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return numPages;
    }


    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", numPages=" + numPages +
                '}';
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

       
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book name: ");
            String name = scanner.nextLine();

            System.out.print("Enter author name: ");
            String author = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter number of pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine();  

            
            books.add(new Book(name, author, price, numPages));
        }

     
        System.out.println("\nBook Details:");
        
            System.out.println(book); 
        

    }
}
