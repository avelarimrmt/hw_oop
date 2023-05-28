package hw_6.task_3.Model;

import hw_6.task_3.Controller.iArea;
import hw_6.task_3.Controller.iVolume;

/** Базовый класс куба */
public class Cube implements iArea, iVolume {
    /** длина ребра */
    private int edge;

    /**
     * конструктор куба 1 параметр
     * @param edge длина ребра
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /** переопределение метода расчета площади куба*/
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /** переопределение метода расчета объема куба*/
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}