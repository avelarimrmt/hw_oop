package Domen;

/** 
* Наследуемый класс студента, реализует сравнение студентов
*/
public class Student extends User implements Comparable<Student>{
    /** id студента*/
    private long idStudent;

    /**
     * конструктор студента 4 параметра
     * @param firstName имя студента
     * @param secondName фамилия студента
     * @param age возраст студента
     * @param idStudent id студента
     */
    public Student(String firstName, String secondName, int age, long idStudent) {
        super(firstName, secondName, age);
        this.idStudent = idStudent;
    }

    /** получаем id студента*/
    public long getIdStudent() {
        return idStudent;
    }

    /**
     * задаем id студента
     * @param idStudent новое id студента
     */
    public void setIdStudent(long idStudent) {
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
    public int compareTo(Student o) {
        
         if(super.getAge() == o.getAge())
         {
            if(this.idStudent == o.idStudent)
            {
                return 0;
            }
            if(this.idStudent < o.idStudent)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge() < o.getAge())
         {
            return -1;
         }   
         return 1;
    }
}