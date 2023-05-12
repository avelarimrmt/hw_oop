package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long idStudent;


    public Student(String firstName, String secondName, int age, long idStudent) {
        super(firstName, secondName, age);
        this.idStudent = idStudent;
    }

    public long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student {" 
                
                +"firstName = " +super.getFirstName()
                +", secondName = " +super.getSecondName()
                +", age = " +super.getAge()+
                ", idStudent = " + idStudent +
                '}' + "\n";
    }

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