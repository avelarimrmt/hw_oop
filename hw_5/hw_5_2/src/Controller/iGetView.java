package Controller;

import java.util.List;

import Model.Student;

/** Интерфейс получения представления*/
public interface iGetView {
    /** Вывести всех студентов*/
    void printAllStudents(List<Student> students);

    /** Считывает данные с консоли*/
    String prompt (String message);
}