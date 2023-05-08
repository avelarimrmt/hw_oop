package Classes;

/** 
 * Наследуемый класс акционного клиента
*/
public class PromotionalClient extends Actor{
    /** название акции*/
    private String nameOfPromotion;
    /** номер клиента в акции*/
    private static int numPromoClient;

    /**
     * конструктор акционного клиента 3 параметра
     * @param name имя акционного клиента
     * @param nameOfPromotion имя акционного клиента
     * @param numPromoClient имя акционного клиента
     */
    public PromotionalClient(String name, String nameOfPromotion, int numPromoClient)
    {
        super(name);
        this.nameOfPromotion = nameOfPromotion;
        PromotionalClient.numPromoClient = numPromoClient;
    }

    /**
     * переопределение получения имени акционного клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /** получаем номер клиента в акции*/
    public int getNumPromoClient() {
        return numPromoClient;
    }

    /** получаем название акции*/
    public String getPromo() {
        return nameOfPromotion;
    }

    /**
     * переопределение метода делал ли акционный клиент заказ
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * переопределение метода забрал ли акционный клиент заказ
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * переопределение метода сделать заказ акционным клиентом
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;  
    }

    /**
     * переопределение метода забрать заказ акционным клиентом
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder; 
    }

    /**
    * переопределение метода получить акционного клиента
    */
    @Override
    public Actor getActor() {
        return this;
    }
}
