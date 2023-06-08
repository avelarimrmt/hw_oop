package Controllers;

import Model.ComplexNumber;
import Model.iCalculatorModel;

/** Контроллер калькулятор */
public class CalculatorController<T> {
    /** модель */
    iCalculatorModel<T> model;
    /** представление */
    iGetView<T> view;

    /**
     * конструктор контроллера 2 параметра
     * @param model модель
     * @param view представление
     */
    public CalculatorController(iCalculatorModel<T> model, iGetView<T> view) {
        this.model = model;
        this.view = view;
        this.run();
    }

    /** основной метод работы программы */
    private void run() {
        boolean flag = true;

        while (flag) {

            T num1 = view.getComplexNumber();
            T num2 = view.getComplexNumber();
            T result = (T) null;

            String op = view.getOperation();

            switch (op) {
                case "addition":
                    result = model.add(num1, num2);
                    break;
                case "multiplication":
                    result = model.multiply(num1, num2);
                    break;
                case "division":
                    result = model.divide(num1, num2);
                    break;
                default:
                    flag = false;
                    break;
            }
            view.showResult((ComplexNumber)result);
        }
    }
}
