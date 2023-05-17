/** 
* Наследуемый класс студента, реализует сравнение студентов
*/
public class Student<T, V, S extends Comparable<S>> extends User<T, V> implements Comparable<Student<T, V, S>>{
    /** id студента*/
    private S idStudent;

    /**
     * конструктор студента 4 параметра
     * @param firstName имя студента
     * @param secondName фамилия студента
     * @param age возраст студента
     * @param idStudent id студента
     */
    public Student(T firstName, T secondName, V age, S idStudent) {
        super(firstName, secondName, age);
        this.idStudent = idStudent;
    }

    /** получаем id студента*/
    public S getIdStudent() {
        return idStudent;
    }

    /**
     * задаем id студента
     * @param idStudent новое id студента
     */
    public void setIdStudent(S idStudent) {
        this.idStudent = idStudent;
    }

    /**
     * переопределение вывода студента
     */
    @Override
    public String toString() {
        return "Student {" 
                
                +"firstName = " +super.getFirstName()
                +", secondName = " +super.getSecondName()
                +", age = " +super.getAge()+
                ", idStudent = " + idStudent +
                '}' + "\n";
    }

    /**
     * переопределение метода сравнения студентов по возрасту и по id
     */
    @Override
    public int compareTo(Student<T, V, S> o) {
        
        return this.idStudent.compareTo(o.idStudent);
    }
}