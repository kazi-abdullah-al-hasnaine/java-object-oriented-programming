public class CartItem {
    private Product _product;
    private int _quantity;

    public CartItem(Product p, int q) {
        _product = p;
        _quantity = q;
    }

    public Product getProduct() {
        return _product;
    }

    public int getQuantity() {
        return _quantity;
    }

    public double getSubtotal() {
        return _product.getPrice() * _quantity;
    }
}
