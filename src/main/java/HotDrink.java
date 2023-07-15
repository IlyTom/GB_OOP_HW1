public class HotDrink extends BottleWater{
    private String name;
    private Integer price;
    private Integer volume;
    private Integer temperature;
    HotDrink(String name,Integer price,Integer volume){
        super(name,price,volume);
    }
    HotDrink(String name,Integer price,Integer volume,Integer temperature){
        super(name,price,volume);
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink {name = " + name +" price = "+ price +" volume = " +volume+" temperature = "+temperature+"}";
    }
}
