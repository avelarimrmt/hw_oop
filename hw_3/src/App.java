import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmployeeController;
import StudentDomen.Employee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        // Student s3 = new Student("Иван", "Петров", 22, (long)121);
        // Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        // Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        // Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        // List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s1);
        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud2.add(s2);
        // listStud2.add(s3);
        // listStud2.add(s4);
        // List<Student> listStud3 = new ArrayList<Student>();
        // listStud3.add(s5);
        // listStud3.add(s6);

        // StudentGroup group1 = new StudentGroup(listStud1);
        // StudentGroup group2 = new StudentGroup(listStud2);
        // StudentGroup group3 = new StudentGroup(listStud3);

        // List<StudentGroup> listGroups = new ArrayList<StudentGroup>();
        // listGroups.add(group1);
        // listGroups.add(group2);
        // listGroups.add(group3);
        // StudentStream stream = new StudentStream(12, listGroups);

        // for (StudentGroup groups : stream) {
        //     System.out.println("NumberOfStream = " + stream.getNumOfStream());
        //     System.out.println(groups);
        // }

        // Collections.sort(stream.getGroups());
        // System.out.println("============= после сортировки =============");

        // for (StudentGroup groups : stream) {
        //     System.out.println("NumberOfStream = " + stream.getNumOfStream() + "\n");
        //     System.out.println(groups);
        // }

        Employee peron1 = new Employee("Джохангир", "Олег", 55, 110);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        //EmployeeController contrEmp = new EmployeeController();
        EmployeeController.paySalary(peron1);
        //contrEmp.paySalary(s1);

        Integer studHour[] = {124,234,231,1,45};
        System.out.println(EmployeeController.mean(studHour));

        Double emplSalary[] = {12555.23,34213.5,10000.0};
        System.out.println(EmployeeController.mean(emplSalary));

        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}