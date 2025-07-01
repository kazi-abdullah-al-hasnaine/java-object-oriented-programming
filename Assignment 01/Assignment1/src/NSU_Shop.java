
public class NSU_Shop {
    public static void main(String[] args) {

        // Create some products
        Product p1 = new Product("P001", "Notebook", 120.0);
        Product p2 = new Product("P002", "Pen", 10.0);
        Product p3 = new Product("P003", "Backpack", 850.0);

        // Create a customer
        Customer customer = new Customer("Fatema Chowdhury", "fatema@nsu.edu");

        // Access the customer's shopping cart
        ShoppingCart cart = customer.getShoppingCart();

        // Add products to the cart
        cart.addItem(p1, 2); // 2 Notebooks
        cart.addItem(p2, 5); // 5 Pens
        cart.addItem(p3, 1); // 1 Backpack

        // Attempt to remove an item
        cart.removeItem("P002"); // Remove Pen

        // Add Pen again with different quantity
        cart.addItem(p2, 3);

        // Display cart summary
        System.out.println("==== Cart Summary for " + customer.getName() + " ====");
        cart.displayCart();

        // Display total
        double total = cart.calculateTotal();
        System.out.printf("Total Amount Payable: %.2f BDT\n", total);
    }
}
