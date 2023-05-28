package hw_6.task_2.Model;

/** 
* Наследуемый класс автобуса
*/
public class Bus extends Vehicle {

    /**
     * конструктор автобуса 1 параметр
     * @param maxSpeed максимальная скорость абобуса
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    /** переопределение метода расчета допустимой скорости автобуса*/
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}