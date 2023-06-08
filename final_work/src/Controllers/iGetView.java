package Controllers;

import Model.ComplexNumber;

/** Интерфейс получения представления*/
public interface iGetView<T> {
    /** метка калькулятора при запуске программы */
    void showLabel();

    /** ввод операции */
    String getOperation();

    /** ввод числа */
    T getComplexNumber();

    /** вывод результата */
    void showResult(ComplexNumber result);
}
