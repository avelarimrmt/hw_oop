package Domen;

/** 
* Наследуемый класс учителя
*/
public class Teacher extends User {
    /** id учителя*/
    private int idTeacher;
    /** ученая степень учителя*/
    private String academicDegree;

    /**
     * конструктор учителя 5 параметров
     * @param firstName имя учителя
     * @param secondName фамилия учителя
     * @param age возраст учителя
     * @param empId id учителя
     * @param academicDegree ученая степень учителя
     */
    public Teacher(String firstName, String secondName, int age, int idTeacher, String academicDegree) {
        super(firstName, secondName, age);
        this.idTeacher = idTeacher;
        this.academicDegree = academicDegree;
    }

    /** получаем id учителя*/
    public int getTeacherId() {
        return idTeacher;
    }

    /**
     * задаем id учителя
     * @param idTeacher новое id учителя
     */
    public void setTeacherId(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    /** получаем степень учителя*/
    public String getLevel() {
        return academicDegree;
    }

    /**
     * задаем степень учителя
     * @param academicDegree новая степень учителя
     */
    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }
}