package hw_6.task_2.Model;

import hw_6.task_2.Controller.iSpeedCalculation;

/** Базовый класс транспортного средства */
public class Vehicle implements iSpeedCalculation  {
    /** максимальная скорость ТС*/
    int maxSpeed;
    /** тип ТС*/
    String type;

    /**
     * конструктор ТС 2 параметр
     * @param maxSpeed максимальная скорость ТС
     * @param type тип ТС
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /** получить максимальную скорость ТС*/
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /** получить тип ТС*/
    public String getType() {
        return this.type;
    }

    /** переопределение метода расчета допустимой скорости ТС*/
    @Override
    public double calculateAllowedSpeed() {
        return 0;
    }
}