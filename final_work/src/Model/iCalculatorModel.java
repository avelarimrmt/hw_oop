package Model;

public interface iCalculatorModel<T> {

    /** Сложение */
    T add(T num1, T num2);

    /** Умножение */
    T multiply(T num1, T num2);

    /** Деление */
    T divide(T num1, T num2);
}
