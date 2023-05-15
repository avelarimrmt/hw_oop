package Domen;

/** 
* Наследуемый класс сотрудника
*/
public class Employee extends User {
    /** id сотрудника*/
    private int empId;

    /**
     * конструктор сотрудника 4 параметра
     * @param firstName имя сотрудника
     * @param secondName фамилия сотрудника
     * @param age возраст сотрудника
     * @param empId id сотрудника
     */
    public Employee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

    /** получаем id сотрудника*/
    public int getEmpId() {
        return empId;
    }

    /**
     * задаем id сотрудника
     * @param empId новое id сотрудника
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }
}