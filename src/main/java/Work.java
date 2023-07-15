
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        VendingMachineHotDrink VMHotDrink = new VendingMachineHotDrink();
        List<HotDrink> hotDrinkList = new ArrayList<>
                (Arrays.asList(new HotDrink("GreenTea",60,350,60),
                        new HotDrink("BlackTea",65,350,55),
                        new HotDrink("Capuccino",85,250,60),
                        new HotDrink("Latte",75,300,45)));
        VMHotDrink.initProduct(hotDrinkList);
        System.out.println(VMHotDrink.getProduct("GreenTea",350,60));
        System.out.println(VMHotDrink.getProduct("Capuccino",250,60));
        System.out.println(VMHotDrink.getProduct("Latte",150,70));
    }
}
