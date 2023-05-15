package Domen;

import java.util.Iterator;
import java.util.List;

/** 
 * Базовый класс группы студентов, реализует итерацию по студентам и сравнение групп
*/
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /** группа*/
    private List<Student> students;

    /**
     * конструктор группы 1 параметр
     * @param students группа
     */
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    /** получаем группу*/
    public List<Student> getStudents() {
        return students;
    }

    /**
     * задаем группу
     * @param students новый список студентов(новая группа)
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * переопределение вывода группы
     */
    @Override
    public String toString() {
        return "Group " + students;
    }

    /**
     * итератор для перебора групп студентов
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    /**
     * сравнение групп по количеству студентов
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size()) {
            return 0;
        }
        if (this.students.size() < o.students.size()) {
            return -1;
        }
        return 1;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new Iterator<Student>() {
    //         private int index = 0;

    //         @Override
    //         public boolean hasNext() {
    //             return index < students.size();
    //         }

    //         @Override
    //         public Student next() {
    //             if (!hasNext()) {
    //                 return null;
    //         }
        
    //         return students.get(index++);
    //         }
    //     };
    // }
}