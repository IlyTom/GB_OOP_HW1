import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleWater extends VendingMachine{
    private List<BottleWater> bottleWater = new ArrayList<>();

    public void initProduct(List<BottleWater> bottleWater) {
        this.bottleWater = bottleWater;
    }

    public BottleWater getProduct(String name) {
        for (BottleWater p : bottleWater) {
            if (p.getName().equals(name)) return p;
        }
        return new BottleWater("Undefined product", 0);
    }
}
