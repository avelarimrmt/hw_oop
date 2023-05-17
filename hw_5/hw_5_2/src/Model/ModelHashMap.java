package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** Вариант класса Model - хэш-таблица*/
public class ModelHashMap extends Model{
    /** хэш-таблица*/
    private HashMap<Long, Student> map;

    /**
     * конструктор модели хэш-таблицы 1 параметр
     * @param students список студентов
     */
    public ModelHashMap(List<Student> students) {
        super(students);
        this.map = new HashMap<>();

        for (Student user : students) {
            map.put(user.getIdStudent(), user);
        }
    }
    
    /** переопределение получения списка всех студентов*/
    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<Student>(map.values());
        return list;
    }
}