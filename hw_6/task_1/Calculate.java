package hw_6.task_1;

/** Базовый класс подсчета*/
public class Calculate {
    /** базовая зп*/
    private int baseSalary;

    /**
     * конструктор подсчета зп 1 параметр
     * @param baseSalary базовая зп
     */
    public Calculate (int baseSalary) {
        this.baseSalary = baseSalary;
    }

    /** считаем чистую заработную плату*/
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}