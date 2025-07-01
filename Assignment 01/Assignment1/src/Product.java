public class Product {
    private String _id;
    private String _name;
    private double _price;

    public Product(String i, String n, double p) {
        _id = i;
        _name = n;
        _price = p;
    }

    public String getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public double getPrice() {
        return _price;
    }

    public String getDetails() {
        return _id + " - " + _name + " : " + _price + " BDT";
    }
}
