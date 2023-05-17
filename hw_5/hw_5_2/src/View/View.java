package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** Базовый класс представления данных */
public class View implements iGetView {
    /** вывести всех студентов 1 параметр
     * @param students список студентов
     */
    public void printAllStudents(List<Student> students) {
        System.out.println("-------вывод списка студентов-------");

        for (Student user : students) {
            System.out.println(user);
        }

        System.out.println("-------конец списка-------");
    }

    /** позволяет считывать данные с консоли
     * @param message сообщеник
     */
    public String prompt (String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}