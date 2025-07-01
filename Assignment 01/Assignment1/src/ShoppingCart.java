import java.util.*;

public class ShoppingCart {
    private List<CartItem> items; //cart item use korechi cause quantity of product janar jnno cart lagbe

    public ShoppingCart() {
        items = new ArrayList<>(); //array list use korechi karon cart e koyta item ache janina
    }

    public void addItem(Product product, int quantity) { //product er id diye check korchi
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {  
                items.remove(item);
                break;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeItem(String productId) {
        items.removeIf(item -> item.getProduct().getId().equals(productId));
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void displayCart() {
        for (CartItem item : items) {
            System.out.println(item.getProduct().getDetails() + " x " + item.getQuantity() + " = " + item.getSubtotal() + " BDT");
        }
    }
}
