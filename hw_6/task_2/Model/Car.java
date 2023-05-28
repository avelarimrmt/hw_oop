package hw_6.task_2.Model;

/** 
* Наследуемый класс автомобиля
*/
public class Car extends Vehicle {

    /**
     * конструктор автомобиля 1 параметр
     * @param maxSpeed максимальная скорость автомобиля
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }
    
    /** переопределение метода расчета допустимой скорости автомобиля*/
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}