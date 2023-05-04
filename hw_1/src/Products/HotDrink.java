package Products;

/** 
 * Наследуемый класс горячего напитка
*/
public class HotDrink extends Product {

    /** температура горячего напитка*/
    private int temperature;
    /** объём горячего напитка */
    private int volume;

    /**
     * конструктор горячекго напитка 4 параметра
     * @param name наименование горячего напитка
     * @param price цена горячего напитка
     * @param volume объём горячего напитка
     * @param temperature температура горячего напитка
     */
    public HotDrink(String name, double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    /** получаем температуру горячего напитка */
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