package Domen;

import java.util.Iterator;
import java.util.List;

/** 
 * Базовый класс потока студентов, реализует итерацию по группам
*/
public class StudentStream implements Iterable<StudentGroup>{
    /** номер потока*/
    private int numOfStream;
    /** список групп(поток)*/
    private List<StudentGroup> groups;

    /**
     * конструктор потока 2 параметра
     * @param numOfStream номер потока
     * @param groups поток
     */
    public StudentStream(int numOfStream, List<StudentGroup> groups) {
        this.numOfStream = numOfStream;
        this.groups = groups;
    }

    /** получаем номер потока*/
    public int getNumOfStream() {
        return numOfStream;
    }
 
    /**
     * задаем номер потока
     * @param numOfStream новый номер потока
     */
    public void setNumOfStream(int numOfStream) {
        this.numOfStream = numOfStream;
    }

    /** получаем список групп(поток)*/
    public List<StudentGroup> getGroups() {
        return groups;
    }

    /**
     * задаем новый поток
     * @param groups новый список групп(новый поток)
     */
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * итератор для перебора групп студентов в потоке
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                return null;
            }
        
            return groups.get(index++);
        }
        };
    }
}