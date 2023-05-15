import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmployeeController;
import Domen.Employee;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;
import Domen.Teacher;
import Service.AverageAge;

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

        Employee emp1 = new Employee("Иванов", "Олег", 55, 110);
        Student st1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student st2 = new Student("Андрей", "Сидоров", 20, (long)111);
        Student st3 = new Student("Иван", "Петров", 18, (long)121);
        Teacher tch1 = new Teacher("Игорь", "Иванов", 26, 301, "кандидат наук");
        Teacher tch2 = new Teacher("Даша", "Цветкова", 42, 171, "доцент");
        Employee emp2 = new Employee("Лена", "Незабудкина", 45, 104);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        List<Employee> employees  = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        List<Teacher> teachers  = new ArrayList<>();
        teachers.add(tch1);
        teachers.add(tch2);

        //EmployeeController contrEmp = new EmployeeController();
        EmployeeController.paySalary(emp1);
        //contrEmp.paySalary(s1);

        Integer studHour[] = {124,234,231,1,45};
        System.out.println(EmployeeController.mean(studHour));

        Double emplSalary[] = {12555.23,34213.5,10000.0};
        System.out.println(EmployeeController.mean(emplSalary));

        AverageAge.getAverageAge(students);
        AverageAge.getAverageAge(employees);
        AverageAge.getAverageAge(teachers);
    }
}