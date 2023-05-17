import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student<String, Integer, Long> st1 = new Student<String, Integer, Long>("Иванов", "Сергей", 23, (long)101);
        System.out.println(st1);
        Student<String, Integer, Long> st2 = new Student<String, Integer, Long>("Андрей", "Сидоров", 22, (long)111);
        Student<String, Integer, Long> st3 = new Student<String, Integer, Long>("Иван", "Петров", 22, (long)121);

        List<Student<String, Integer, Long>> listStud = new ArrayList<>();
        listStud.add(st1);
        listStud.add(st2);
        listStud.add(st3);

        StudentGroup<String, Integer, Long> group = new StudentGroup<String, Integer, Long>(listStud);

        for (Student<String, Integer, Long> stud : group) {
            System.out.println(stud);
        }

        Collections.sort(group.getStudents());
    }
}