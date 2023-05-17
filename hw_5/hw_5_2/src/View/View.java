package View;

import java.util.List;

import Model.Student;

/** Базовый класс представления данных (на русском языке)*/
public class View extends GeneralView {
    /** переопределение вывода всех студентов на русском языке*/
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("-------вывод списка студентов-------");

        for (Student user : students) {
            System.out.println(user);
        }

        System.out.println("-------конец списка-------");
    }
}