package StudentDomen;

/** 
 * Базовый класс пользователя
*/
public class User {
    /** имя пользователя*/
    private String firstName;
    /** фамилия пользователя*/
    private String secondName;
    /** возраст пользователя*/
    private int age;

    /**
     * конструктор пользователя 3 параметра
     * @param firstName имя пользователя
     * @param secondName фамилия пользователя
     * @param age возраст пользователя
     */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /** получаем имя пользователя*/
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * задаем имя пользователя
     * @param firstName новое имя пользователя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** получаем фамилию пользователя*/
    public String getSecondName() {
        return secondName;
    }
    
    /**
     * задаем фамилию пользователя
     * @param secondName новая фамилия пользователя
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /** получаем возраст пользователя*/
    public int getAge() {
        return age;
    }

    /**
     * задаем возраст пользователя
     * @param age новый возраст пользователя
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * переопределение вывода пользователя
     */
    @Override
    public String toString()
    {
        return "User{" +
        "firstName = '" + firstName + '\'' +
        ", secondName = '" + secondName + '\'' +
        ", age = " + age +
        '}';
    }
}