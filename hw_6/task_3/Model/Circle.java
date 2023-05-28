package hw_6.task_3.Model;

import hw_6.task_3.Controller.iArea;

/** Базовый класс окружности */
public class Circle implements iArea {
    /** радиус окружности */
    private double radius;

    /**
     * конструктор окружности 1 параметр
     * @param radius радиус окружности
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** переопределение метода расчета площади окружности*/
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}