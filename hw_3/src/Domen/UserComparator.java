package Domen;

import java.util.Comparator;

/** 
 * Класс, реализует сравнение двух объектов из класса User, в том числе и его наследников
*/
public class UserComparator<T extends User> implements Comparator<T> {

    /**
     * переопределение метода сравнения пользователей по имени или фамилии
     */
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}