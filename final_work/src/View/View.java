package View;

import java.util.Scanner;

import Controllers.iGetView;
import Model.ComplexNumber;

/** Базовый класс представления данных */
public class View implements iGetView<ComplexNumber> {
    /** сканнер */
    private Scanner scanner;

    /** объявление сканнера */
    public View() {
        scanner = new Scanner(System.in);
    }

    /** показать метку калькулятора при запуске программы */
    @Override
    public void showLabel() {
        System.out.println("------Калькулятор комплексных чисел-------");
    }

    /** получить комплексное число */
    @Override
    public ComplexNumber getComplexNumber() {
        System.out.print("Введите действительную часть числа: ");
        double realPart = scanner.nextDouble();
        System.out.print("Введите мнимую часть числа: ");
        double imaginPart = scanner.nextDouble();

        ComplexNumber num = new ComplexNumber(realPart, imaginPart);
        System.out.println("Введено комплексное число: " + num + '\'');
        return num; 
    }

    /** получить операцию */
    @Override
    public String getOperation() {
        String str = ""; 
        
        while (true) {
            System.out.print("Введите операцию (+ * /): ");
            char op = scanner.next().charAt(0);
            switch (op) {
                case '+':
                    str = "addition";
                    break;

                case '*':
                    str = "multiplication";
                    break;

                case '/':
                    str = "division";
                    break;
        
                default:
                    System.out.println("Операция не распознана");
                    break;
            }

            return str;
        }
    }

    /** показать результат */
    @Override
    public void showResult(ComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }
} 
