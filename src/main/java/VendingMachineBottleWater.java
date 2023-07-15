import java.util.ArrayList;
import java.util.List;

class VendingMachineBottleWater implements VendingMachine{
    private List<BottleWater> bottleWater = new ArrayList<>();

    public void initProduct(List<BottleWater> bottleWater) {
        this.bottleWater = bottleWater;
    }





    public Product getProduct(String name) {
        for (BottleWater p : bottleWater) {
            if (p.getName().equals(name)) return p;
        }
        return new BottleWater("Undefined product", 0,0);
    }


    public Product getProduct(String name, Integer volume) {
        for (BottleWater p : bottleWater) {
            if (p.getName().equals(name) && p.getVolume().equals(volume)) return p;
        }
        return new BottleWater("Undefined product", 0,0);
    }


    @Override
    public Product getProduct() {
        return null;
    }
}
