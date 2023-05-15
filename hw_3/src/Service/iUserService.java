package Service;

import java.util.List;

/** 
 * Интерфейс поведения с любым пользователем
*/
public interface iUserService<T> {
    /** получает содержимое всех сервисов (в зависимости от типа T)*/
    List<T> getAll();

    /** создание пользователя (в зависимости от типа T)*/
    void create(String firstName, String secondName, int age);
}