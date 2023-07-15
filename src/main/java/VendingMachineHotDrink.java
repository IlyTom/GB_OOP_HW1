import java.util.ArrayList;
import java.util.List;

class VendingMachineHotDrink implements VendingMachine{
    private List<HotDrink> hotDrinkList = new ArrayList<>();
    public void initProduct(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    @Override
    public Product getProduct() {
        return null;
    }


    public Product getProduct(String name, Integer volume, Integer temperature) {
        for (HotDrink hd : hotDrinkList) {
            if (hd.getName().equals(name)&&hd.getVolume().equals(volume)&&hd.getTemperature().equals(temperature))
                    return hd;
        }
        return new HotDrink("Undefined product", 0,0,0);
    }
}
