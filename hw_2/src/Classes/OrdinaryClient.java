package Classes;

import java.util.ArrayList;
import java.util.List;

/** 
 * Наследуемый класс обычного клиента
*/
public class OrdinaryClient extends Actor {

    /**
     * конструктор обычного клиента 1 параметр
     * @param name имя обычного клиента
     */
    public OrdinaryClient(String name)
    {
        super(name);
    }

    /**
     * переопределение получения имени обычного клиента
     */
    @Override
    public String getName() {        
        return super.name;
    }

    /**
     * переопределение метода делал ли обычный клиент заказ
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * переопределение метода забрал ли обычный клиент заказ
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * переопределение метода сделать заказ обычным клиентом
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /**
     * переопределение метода забрать заказ обычным клиентом
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /**
     * переопределение метода получить обычного клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * возврат товара обычному клиенту
     * @param orderId id товара
     */
    @Override
    public void returnOrder(int orderId) {
        System.out.println("Невозможно вернуть товар " + orderId + " клиенту " + getActor().getName());
        super.isReturnOrder = false;
    }
}