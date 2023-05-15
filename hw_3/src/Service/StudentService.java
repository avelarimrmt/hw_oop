package Service;

import java.util.ArrayList;
import java.util.List;

import Domen.Student;

/** 
* Класс-сервис для студента
*/
public class StudentService implements iUserService<Student> {
    /** сквозной номер студента*/
    private int count;
    /** список всех студентов*/
    private List<Student> students;

    /** конструктор создания студента*/
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /** переопределение метода создания студента с генерацией id
     * @param firstName имя студента
     * @param secondName фамилия студента
     * @param age возраст студента 
     */
    @Override
    public void create(String firstName, String secondName, int age) {
       Student us = new Student(firstName, secondName, age, count);
       count++;  
       students.add(us);      
    }

    /** переопределение метода получения всех студентов*/
    @Override
    public List<Student> getAll() {
        return students;
    }   
}