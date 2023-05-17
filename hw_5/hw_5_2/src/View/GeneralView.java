package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** Базовый класс представления данных (на русском языке)*/
public abstract class GeneralView implements iGetView {
    /** вывести всех студентов 1 параметр
     * @param students список студентов
     */
    public void printAllStudents(List<Student> students) {
    }

    /** позволяет считывать данные с консоли
     * @param message сообщение
     */
    public String prompt (String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}