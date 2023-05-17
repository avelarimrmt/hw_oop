package Controller;

import java.util.List;

import Model.Student;

/** Интерфейс получения модели*/
public interface iGetModel {
    /** получаем список всех студентов*/
    public List<Student> getAllStudents();
}