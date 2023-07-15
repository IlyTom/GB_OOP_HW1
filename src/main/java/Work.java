
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        //Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
        //сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
        //ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
        VendingMachineBottleWater vendingMachine = new VendingMachineBottleWater();
        List<BottleWater> bottleWaters = new ArrayList<>(Arrays.asList(new BottleWater("Fanta",10,330),
                new BottleWater("Pepsi",10,500),
                new BottleWater("Cola",10,330)));
        vendingMachine.initProduct(bottleWaters);
        System.out.println(vendingMachine.getProduct("").toString());
    }
}
