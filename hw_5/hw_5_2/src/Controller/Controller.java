package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;

/** Базовый класс контроллера*/
public class Controller {
    /** список студентов*/
    private List<Student> students;

    /** экземпляр представления*/
    private iGetView view;

    /** экземпляр модели*/
    private iGetModel model;
    
    /**
     * конструктор контроллера 2 параметра
     * @param view представление
     * @param model модель
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<>();
    }

    /** получить список всех студентов из модели*/
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    /** тест данных (есть ли студенты в бд или нет)*/
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        }
        else return false;
    }

    /** обновление представления*/
    public void updateView() {
        //MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        }
        else System.out.println("Список студентов пуст!");

        //MVC
        // view.printAllStudents(model.getAllStudents());
    }

    /** перехват комманд от пользователя*/
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;

        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
            
                case LIST:
                    getAllStudents();
                    updateView();
                    break;
            }
        }
    }
}