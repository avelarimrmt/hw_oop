package Service;

import java.util.ArrayList;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.UserComparator;

/** 
* Класс-сервис для группы студентов
*/
public class StudentGroupService {
    /** список всех групп студентов*/
    private List<StudentGroup> groups;

    /** конструктор создания группы студентов*/
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    /** получение всех групп студентов*/
    public List<StudentGroup> getAll()
    {
        return this.groups;
    }

    /** сортировка групп студентов по фамилии и имени
     * @param numberGroup номер группы
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}