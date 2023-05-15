package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Domen.Teacher;
import Domen.UserComparator;

/** 
* Класс-сервис для учителей
*/
public class TeacherService implements iUserService<Teacher> {
    /** сквозной номер учителя*/
    private int count;
    /** список всех учителей*/
    private List<Teacher> teachers;

    /** конструктор создания учителя*/
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /** переопределение метода создания учителя с генерацией id
     * @param firstName имя учителя
     * @param secondName фамилия учителя
     * @param age возраст учителя 
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        System.out.println("Enter academic degree");
        Scanner sc = new Scanner(System.in);

        String dg = sc.nextLine();
        Teacher us = new Teacher(firstName, secondName, age, count, dg);
        count++;
        teachers.add(us);
    }

    /** переопределение метода получения всех учителей*/
    @Override
    public List<Teacher> getAll()
    {
        return teachers;
    }

    /** сортировка сотрудников по фамилии и имени*/
    public List<Teacher> getSortedByFIOSУEmployees()
    {
        List<Teacher> emps = new ArrayList<>(teachers);
        emps.sort(new UserComparator<Teacher>());
        return emps;
    }
}