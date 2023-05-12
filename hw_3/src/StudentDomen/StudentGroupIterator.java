package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
* итератор для перебора групп студентов
*/
public class StudentGroupIterator implements Iterator<Student>{
    /** счетчик*/
    private int counter;
   
    /** список студентов*/
    private final List<Student> students;

    /**
     * конструктор итератора 1 параметр
     * @param students список студентов
     */
    public StudentGroupIterator(List<Student> students) {
        this.counter = 0;
        this.students = students;
    }

    /**переопределение метода для итератора(проверка, что счетчик достиг предела) */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /**переопределение метода для итератора(возвращает следующего студента) */
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        
        return students.get(counter++);
    }
}