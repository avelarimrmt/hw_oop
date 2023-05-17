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

    /** удаляет студента из списка
     * @param idStud id студента
     */
    public void deleteStudentFromList(long idStud) {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            if (students.get(i).getIdStudent() == idStud)
                students.remove(i);
            
        }
        if (size != students.size()) {
                System.out.println("Такого номера нет!");
            }
    }
}