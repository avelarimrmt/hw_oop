package Service;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.UserComparator;

/** 
* Класс-сервис для сотрудников
*/
public class EmployeeService implements iUserService<Employee> {
    /** сквозной номер сотрудника*/
    private int count;
    /** список всех сотрудников*/
    private List<Employee> employees;

    /** конструктор создания сотрудника*/
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }
    
    /** переопределение метода создания сотрудника с генерацией id
     * @param firstName имя сотрудника
     * @param secondName фамилия сотрудника
     * @param age возраст сотрудника 
     */
    @Override
    public void create(String firstName, String secondName, int age) {
       Employee us = new Employee(firstName, secondName, age, count);
       count++;
       employees.add(us);
    }

    /** переопределение метода получения всех сотрудников*/
    @Override
    public List<Employee> getAll()
    {
        return employees;
    }

    /** сортировка сотрудников по фамилии и имени*/
    public List<Employee> getSortedByFIOSУEmployees()
    {
        List<Employee> emps = new ArrayList<>(employees);
        emps.sort(new UserComparator<Employee>());
        return emps;
    }
}