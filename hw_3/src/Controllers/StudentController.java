package Controllers;

import Domen.Student;
import Service.StudentGroupService;
import Service.StudentService;

/** 
 * Класс-контроллер студента (вся логика работы со студентами)
*/
public class StudentController implements iUserController<Student> {
    /** данные по работе сервиса со студентами*/
    private final StudentService dataService = new StudentService();
    /** данные по работе сервиса с группами студентов*/
    private final StudentGroupService groupService = new StudentGroupService();

    /** переопределение метода создания студента*/
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
}