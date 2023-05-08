package Interfaces;

/** 
 * Интерфейс поведения очереди
*/
public interface iQueueBehaviour {
    /** попасть в очередь
     * @param actor клиент
    */
    void takeInQueue(iActorBehaviour actor);
    /** уйти из очереди*/
    void releaseFromQueue();
    /** взять заказ*/
    void takeOrder();
    /** получить заказ*/
    void getOrder();
}