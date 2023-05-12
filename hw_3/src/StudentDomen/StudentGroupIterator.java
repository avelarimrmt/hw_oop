package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{
    private int counter;
   
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.counter = 0;
        this.students = students;
    }

    /**переопределение метода для итератора(проверка, что счетчик достиг предела) */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        
        return students.get(counter++);
    }
}