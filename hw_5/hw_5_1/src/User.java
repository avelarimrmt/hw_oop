/** 
 * Базовый класс пользователя с ипользованием Generic
*/
public class User<T, V> {
    /** имя пользователя*/
    private T firstName;
    /** фамилия пользователя*/
    private T secondName;
    /** возраст пользователя*/
    private V age;

    /**
     * конструктор пользователя 3 параметра
     * @param firstName имя пользователя
     * @param secondName фамилия пользователя
     * @param age возраст пользователя
     */
    public User(T firstName, T secondName, V age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /** получаем имя пользователя*/
    public T getFirstName() {
        return firstName;
    }
    
    /**
     * задаем имя пользователя
     * @param firstName новое имя пользователя
     */
    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    /** получаем фамилию пользователя*/
    public T getSecondName() {
        return secondName;
    }
    
    /**
     * задаем фамилию пользователя
     * @param secondName новая фамилия пользователя
     */
    public void setSecondName(T secondName) {
        this.secondName = secondName;
    }

    /** получаем возраст пользователя*/
    public V getAge() {
        return age;
    }

    /**
     * задаем возраст пользователя
     * @param age новый возраст пользователя
     */
    public void setAge(V age) {
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