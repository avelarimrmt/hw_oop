package Interfaces;

import Classes.Actor;

/** 
 * Интерфейс поведения клиента
*/
public interface iActorBehaviour {
    /** сделать заказ
     * @param makeOrder сделал ли клиент заказ
    */
    void setMakeOrder(boolean makeOrder);
    /** забрать заказ
     * @param makeOrder забрал ли клиент заказ
    */
    void setTakeOrder(boolean pickUpOrder);
    /** делал ли клиент заказ*/
    boolean isMakeOrder();
    /** забрал ли клиент заказ*/
    boolean isTakeOrder();
    /** получить клиента*/
    Actor getActor();
}