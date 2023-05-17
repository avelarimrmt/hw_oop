package Model;

import java.util.List;

import Controller.iGetModel;

/** Базовый класс модели данных */
public class Model implements iGetModel {
    /** список студентов*/
    private List<Student> students;

     /**
     * конструктор модели 1 параметр
     * @param students список студентов
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    /** получаем список всех студентов*/
    public List<Student> getAllStudents() {
        return students;
    }
}