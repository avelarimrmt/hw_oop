package Products;

public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink(String name, double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    /**
     * переопределение вывода горячего напитка
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name = '" + super.getName() + '\'' +
        ", price = " + super.getPrice() +
        ", temperature = " + temperature +
        ", volume = " + volume +
        '}';
    }
}
