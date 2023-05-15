package Service;

import java.util.List;

import Domen.User;

/** 
* Класс для подсчета среднего возраста пользователей
*/
public class AverageAge<T extends User>{
    public static <T> void getAverageAge(List<T> users) {
		double sum = 0;
		for (T user : users) {
			sum += ((User) user).getAge();
		}
		sum /= users.size();
		System.out.println("Average age of: " + sum);
	}
}