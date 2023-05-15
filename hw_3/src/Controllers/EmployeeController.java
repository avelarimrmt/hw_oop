package Controllers;

import Domen.Employee;
import Domen.User;
import Service.EmployeeService;

/** 
 * Класс-контроллер сотрудника (вся логика работы с сотрудниками)
*/
public class EmployeeController implements iUserController<Employee> {
    /** данные по работе сервиса с сотрудниками*/
    private final EmployeeService empService = new EmployeeService();

    /** переопределение метода создания сотрудника с генерацией id
     * @param firstName имя сотрудника
     * @param secondName фамилия сотрудника
     * @param age возраст сотрудника 
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /** зп сотрудника
     * @param person данные по сотруднику
     */
    static public <T extends Employee> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }

    /** среднее
     * @param num данные по сотруднику
     */
    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i = 0; i < num.length; i++)
        {
            sum += num[i].doubleValue();
        }
        sum /= num.length;
        return sum;
    }
}