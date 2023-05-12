package Interfaces;

/** 
 * Интерфейс возврата заказа
*/
public interface iReturnOrder {
    /** вернуть заказ по id
     * @param idOrder id товара
    */
    void returnOrder(int idOrder);
}