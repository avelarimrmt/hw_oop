package Controllers;

import Domen.Teacher;
import Service.TeacherService;

/** 
 * Класс-контроллер учителя (вся логика работы с учителями)
*/
public class TeacherController implements iUserController<Teacher>{
    /** данные по работе сервиса с учителями*/
    private final TeacherService dataService = new TeacherService();

    /** переопределение метода создания учителя*/
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
}