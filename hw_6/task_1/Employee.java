package hw_6.task_1;

import java.sql.Date;

/** Базовый класс сотрудника */
public class Employee {
    /** имя сотрудника*/
    private String name;
    /** день рождения сотрудника*/
    private Date dob;

    /**
     * конструктор сотрудника 2 параметра
     * @param name имя сотрудника
     * @param dob день рождения сотрудника
     */
    public Employee (String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    /** получаем информацию о сотруднике*/
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}