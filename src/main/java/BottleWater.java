import java.util.Iterator;

class BottleWater extends Product{
    private String name;
    private Integer price;
    BottleWater(String name,Integer price){
        super(name,price);
        this.name=name;
        this.price=price;
    }

    BottleWater(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public String toString() {
        return "BottleWater {name = " + name +" price = "+ price +"}";
    }
}
