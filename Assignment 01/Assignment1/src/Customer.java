public class Customer {
    private String name;
    private String email;
    private ShoppingCart cart;

    public Customer(String _n, String _e) {
        name = _n;
        email = _e;
        cart = new ShoppingCart();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ShoppingCart getShoppingCart() {
        return cart;
    }
}
