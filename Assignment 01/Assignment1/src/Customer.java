public class Customer {
    private String name;
    private String email;
    private ShoppingCart cart;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.cart = new ShoppingCart();
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public ShoppingCart getShoppingCart() { return cart; }
}
