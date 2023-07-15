import java.util.Iterator;

class BottleWater extends Product{
    private String name;
    private Integer price;
    private Integer volume;
    BottleWater(String name,Integer price,Integer volume){
        super(name,price);
        this.name=name;
        this.price=price;
        this.volume = volume;
    }

    BottleWater(String name) {
        super(name);
        this.name=name;
    }
    public Integer getVolume(){
        return volume;
    }
    @Override
    public String toString() {
        return "BottleWater {name = " + name +" price = "+ price +" volume = " +volume+"}";
    }
}
