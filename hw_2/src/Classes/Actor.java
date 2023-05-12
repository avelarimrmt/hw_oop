package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/** 
 * Абстрактный класс клиента
*/
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /** имя клиента*/
    protected String name;
    /** клиент получил заказ*/
    protected boolean isTakeOrder;
    /** клиент сделал заказ*/
    protected boolean isMakeOrder;
    /** клиент вернул заказ*/
    protected boolean isReturnOrder;

    /**
     * конструктор клиента 1 параметр
     * @param name имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /** получаем имя клиента*/
    public abstract String getName(); 
}