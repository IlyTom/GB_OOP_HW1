
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("Chocolate",50),
                new Product("Pepsi",10),
                new Product("Milk",8)));
        vendingMachine.initProduct(products);
        System.out.println(vendingMachine.getProduct("Chocolate").toString());
    }
}
