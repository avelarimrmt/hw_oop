package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/** Базовый класс файлового репозитория */
public class FileRepo implements iGetModel{
    /** название файла*/
    private String fileName;

    /** список студентов*/
    private List<Student> students;

    /**
     * конструктор файлового репозитория 1 параметр
     * @param fileName название файла
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();

        //если файл откроется, то файл закроется
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /** добавить студента
     * @param student студент
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /** читать всех студентов из файла*/
    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                String[] param = line.split(" ");
                Student user = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(user);
                line = reader.readLine();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /** запись данных в файл*/
    public void saveAllStudentToFile() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student user : students) {
                fw.write(user.getFirstName() + " " + user.getSecondName() + " " + user.getAge() + " " + user.getIdStudent());
                fw.append("\n");
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /** переопределение получаемого списка всех студентов*/
    @Override
    public List<Student> getAllStudents() {
        readAllStudentsFromFile();
        return students;
    }
}