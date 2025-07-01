public class Customer {
    private String _name;
    private String _email;
    private ShoppingCart _cart;

    public Customer(String _n, String _e) {
        _name = _n;
        _email = _e;
        _cart = new ShoppingCart(); // customer banaile shopping cart ow hobe
    }

    public String getName() {
        return _name;
    }

    public String getEmail() {
        return _email;
    }

    public ShoppingCart getShoppingCart() {
        return _cart;
    }
}
