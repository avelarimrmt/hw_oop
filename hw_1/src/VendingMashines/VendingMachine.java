package VendingMashines;

import java.util.ArrayList;
import java.util.List;

import Products.Product;

/** 
 * Базовый класс вендинговой машины
*/
public class VendingMachine {
    /** вместимость вендинговой машины*/
    private int volume;
    /** список продуктов*/
    private List<Product> products;
    /** список покупок*/
    private List<String> workLog;

    /**
     * конструктор вединговой машины 1 параметр
     * @param volume вместимость вендинговой машины
     */
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    /**
     * добавляем продукт общий список продуктов
     * @param prod новый продукт
     */
    public void addProduct(Product prod) {
        products.add(prod);
    }

    /**
     * добавляем информацию о покупке в общий список покупок
     * @param line информация о покупке
     */
    public void addSales(String line)
    {
        workLog.add(line);
    }

    /**
     * получаем наименование продукта
     * @param name наименование продукта
     */
    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if (prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    /** получаем список всех продуктов */
    public List<Product> getProdAll()
    {
        return products;
    }
}