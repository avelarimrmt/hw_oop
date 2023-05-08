package Classes;

import Interfaces.iActorBehaviour;

/** 
 * Абстрактный класс клиента
*/
public abstract class Actor implements iActorBehaviour {
    /** имя клиента*/
    protected String name;
    /** клиент получил заказ*/
    protected boolean isTakeOrder;
    /** клиент сделал заказ*/
    protected boolean isMakeOrder;

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