package Controllers;

import Domen.User;

/** 
 * Интерфейс-контроллер пользователя (логика работы с пользователями)
*/
public interface iUserController<T extends User> {
    /** создание пользователя (в зависимости от типа T)*/
    void create(String firstName, String secondName, int age);
}