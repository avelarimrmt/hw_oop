package View;

import java.util.List;

import Model.Student;

/** Базовый класс представления данных (на английском языке)*/
public class ViewEng extends GeneralView {
    /** переопределение вывода всех студентов на английском языке*/
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("-------OUTPUT LIST OF STUDENTS-------");

        for (Student user : students) {
            System.out.println(user);
        }

        System.out.println("-------END OF THE LIST-------");
    }
}