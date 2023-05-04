import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMashines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
    
        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500));

        HotDrink iceLatte = new HotDrink("ice Latte", 200.0, 40, 200);
        itemMachine.addProduct(iceLatte);

        itemMachine.addProduct(new HotDrink("Cappuccino", 100.0, 70, 200));
        itemMachine.addProduct(new HotDrink("Latte", 150.0, 80, 300));

        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }
    }
}