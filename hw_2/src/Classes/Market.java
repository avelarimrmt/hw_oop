package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/** 
 * Базовый класс магазина
*/
public class Market implements iMarketBehaviour,iQueueBehaviour, iReturnOrder {
    //private List<Actor> queue;
    private List<iActorBehaviour> queue;

    /** конструктор магазина*/
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * переопределение прихода клиента в магазин
     * @param actor клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * переопределение добавления в очередь
     * @param actor клиент
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    /**
     * переопределение ухода из магазина
     * @param actors список клиентов
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * переопределение обновления статуса
     */
    @Override
    public void update() {
       takeOrder();
       getOrder();
       releaseFromQueue();
    }

    /**
     * переопределение получения заказа
     */
    @Override
    public void getOrder() {
        for (iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }

    /**
     * переопределение ухода из очереди
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for (iActorBehaviour actor:queue)
       {
        if (actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }
       }
    releaseFromMarket(releaseActors);
    }

    /**
     * переопределение взятия заказа
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
    }

    /**
     * переопределение возврата заказа
     */
    @Override
    public void returnOrder() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor:queue) {
            if (actor.isTakeOrder()) {
                actor.setTakeOrder(false);
                System.out.println(actor.getActor().getName()+" клиент вернул заказ ");

                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }
}