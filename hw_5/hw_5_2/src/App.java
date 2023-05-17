import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHashMap;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> listStud = new ArrayList<>();

        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        FileRepo mFileRepo = new FileRepo("StudentDb.txt");
        // for (Student user : listStud) {
        //     mFileRepo.addStudent(user);
        // }
        // mFileRepo.saveAllStudentToFile();

        iGetModel model = new Model(listStud);
        iGetModel modelFileRepo = mFileRepo;
        iGetModel modelHashMap = new ModelHashMap(listStud);
       
        iGetView view = new View();
        iGetView viewEng = new ViewEng();
        Controller controller = new Controller(view, modelHashMap);
        controller.choiceLang();
        
        if (controller.getIsRus()) {
            view = viewEng;
        }
      
        
        controller.run();
        
    }
}