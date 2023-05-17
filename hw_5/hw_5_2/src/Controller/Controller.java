package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Student;

/** Базовый класс контроллера(взаимодействие с моделью и представлением)*/
public class Controller {
    /** список студентов*/
    private List<Student> students;

    /** экземпляр представления*/
    private iGetView view;

    /** экземпляр модели*/
    private iGetModel model;

    /** русский язык или нет*/
    private boolean isRus;
    
    /**
     * конструктор контроллера 2 параметра
     * @param view представление
     * @param model модель
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<>();
        this.isRus = true;
    }

    /** какой язык установлен*/
    public boolean getIsRus() {
        return isRus;
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

    /** выбор языка*/
    public void choiceLang() {
        Commands cmnd = Commands.NONE;
        
        String command = view.prompt("RUS OR ENG?: ");
        cmnd = Commands.valueOf(command.toUpperCase());
            switch (cmnd) {
                case RUS:
                    isRus = true;      
                    System.out.println("Установлен русский язык");
                    break;
            
                case ENG:
                    isRus = false;
                    System.out.println("Choice english language");
                    break;
            }
    }

    /** перехват комманд от пользователя*/
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        
        String entCom = "";
        String extProg = "";
        String entIfDel = "";

        if (isRus) {
            entCom = "Введите команду: ";
            extProg = "Выход из программы";
            entIfDel = "Введите ID студента, которого хотите удалить из списка";
        } else {
            entCom = "Enter the command: ";
            extProg = "Exit from the program";
            entIfDel = "Enter ID of student, ypu want to remove from list";
        }

        while (getNewIteration) {
            String command = view.prompt(entCom);
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println(extProg);
                    break;
            
                case LIST:
                    getAllStudents();
                    updateView();
                    break;

                case DELETE:
                    System.out.println(entIfDel);
                    Scanner in = new Scanner(System.in);
                    Long idStud = in.nextLong();
                    model.deleteStudentFromList(idStud);
                    updateView();
                    break;
            }
        }
    }
}