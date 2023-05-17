import java.util.Iterator;
import java.util.List;

/** 
 * Базовый класс группы студентов, реализует итерацию по студентам и сравнение групп
*/
public class StudentGroup<T, V, S extends Comparable<S>> implements Iterable<Student<T, V, S>>, Comparable<StudentGroup<T, V, S>> {
    /** группа*/
    private List<Student<T, V, S>> students;

    /**
     * конструктор группы 1 параметр
     * @param students группа
     */
    public StudentGroup(List<Student<T, V, S>> students) {
        this.students = students;
    }

    /** получаем группу*/
    public List<Student<T, V, S>> getStudents() {
        return students;
    }

    /**
     * задаем группу
     * @param students новый список студентов(новая группа)
     */
    public void setStudents(List<Student<T, V, S>> students) {
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
     * сравнение групп по количеству студентов
     */
    @Override
    public int compareTo(StudentGroup<T, V, S> o) {
        if (this.students.size() == o.students.size()) {
            return 0;
        }
        if (this.students.size() < o.students.size()) {
            return -1;
        }
        return 1;
    }

    /**
     * итератор для перебора групп студентов
     */
    @Override
    public Iterator<Student<T, V, S>> iterator() {
        return new Iterator<Student<T, V, S>>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student<T, V, S> next() {
                if (!hasNext()) {
                    return null;
            }
        
            return students.get(index++);
            }
        };
    }
}