package Classes;

/** 
 * Наследуемый класс VIP клиента
*/
public class SpecialClient extends Actor {
    /** номер VIP клиента*/
    private int idVIP;

    /**
     * конструктор VIP клиента 2 параметра
     * @param name имя VIP клиента
     * @param idVIP номер VIP клиента
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    /**
     * переопределение получения имени VIP клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /** получаем номер VIP клиента*/
    public int getIdVIP() {
        return idVIP;
    }

    /**
     * переопределение метода делал ли VIP клиент заказ
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * переопределение метода забрал ли VIP клиент заказ
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * переопределение метода сделать заказ VIP клиентом
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /**
     * переопределение метода забрать заказ VIP клиентом
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /**
     * переопределение метода получить VIP клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * возврат товара VIP клиенту
     * @param orderId id товара
     */
    @Override
    public void returnOrder(int orderId) {
        System.out.printf("Номер позиции возврата: %d\n", orderId);
        super.isReturnOrder = true;
    }
}