package Interfaces;

import java.util.List;

import Classes.Actor;

/** 
 * Интерфейс поведения в магазине
*/
public interface iMarketBehaviour {
    /** приход клиента в магазин
     * @param actor клиент
    */
    void acceptToMarket(iActorBehaviour actor);
    /** уход клиентов из магазина
     * @param actors список клиентов
    */
    void releaseFromMarket(List<Actor> actors);
    /** обновление статуса*/
    void update();    
}