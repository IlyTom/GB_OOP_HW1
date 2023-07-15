import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
    private String name;
    private Integer price;

    Product(String name, Integer price){
        this.name = name;
        this.price = price;
    }
    Product(String name){
        this.name = name;
        this.price = null;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price){
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product {name = " + name +" price = "+price+"}";
    }
}
class VendingMachine{
    private List<Product> products = new ArrayList<>();
    public void initProduct(List<Product> products){
        this.products = products;
    }
    public Product getProduct(String name){
        for (Product p:products){
            if (p.getName().equals(name)) return p;
        }
        return new Product("Undefined product",0);
    }

}
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
