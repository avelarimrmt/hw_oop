package Products;

/** 
 * Наследуемый класс бутылки воды
*/
public class BottleOfWater extends Product {

    /** объём бутылки */
    private int volume;

    /**
     * конструктор бутылки воды 3 параметра
     * @param name наименование воды
     * @param price цена бутылки воды
     * @param volume цена бутылки воды
     */
    public BottleOfWater(String name, double price, int volume)
    {
        super(name, price);
        this.volume = volume;
    }
    
    /** получаем объём бутылки воды */
    public int getVolume() {
        return volume;
    }

    /**
     * устанавливаем объём бутылки воды
     * @param volume новый объём бутылки воды
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * переопределение вывода бутылки воды
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name = '" + super.getName() + '\'' +
        ", price = " + super.getPrice() +
        ", volume = " + volume +
        '}';
    }
}
