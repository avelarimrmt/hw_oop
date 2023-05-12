package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group " + students + "\n";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

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