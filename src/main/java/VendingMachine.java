import java.util.ArrayList;
import java.util.List;

class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void initProduct(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) return p;
        }
        return new Product("Undefined product", 0);
    }
}
