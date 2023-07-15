import java.util.ArrayList;
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

    }
}
