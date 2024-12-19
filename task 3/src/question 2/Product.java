public class Product implements Taxable {
    private int productId;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate sales tax
    @Override
    public double calcTax() {
        return price * SALES_TAX * quantity; // Sales tax = price * 7% * quantity
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
