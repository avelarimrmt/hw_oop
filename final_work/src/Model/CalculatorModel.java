package Model;

/** Базовый класс модели калькулятора, реализует интерфейс iCalculatorModel<ComplexNumber> */
public class CalculatorModel implements iCalculatorModel<ComplexNumber> {

    /**
     * переопределение для операции сложения двух комплексных чисел
     * @param num1 первое комплексное число
     * @param num2 второе комплексное число
     * @return результат сложения
     */
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getRealPart() + num2.getRealPart(), num1.getImaginPart() + num2.getImaginPart());
    }

    /**
     * переопределение для операции умножения двух комплексных чисел
     * @param num1 первое комплексное число
     * @param num2 второе комплексное число
     * @return результат умножения
     */
    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getRealPart() * num2.getRealPart() - num1.getImaginPart() * num2.getImaginPart(),
        num1.getRealPart() * num2.getImaginPart() + num1.getImaginPart() * num2.getRealPart());
    }

    /**
     * переопределение для операции деления двух комплексных чисел
     * @param num1 первое комплексное число
     * @param num2 второе комплексное число
     * @return результат деления
     */
    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getRealPart() * num2.getRealPart() + num2.getImaginPart() * num2.getImaginPart();

        return new ComplexNumber((num1.getRealPart() * num2.getRealPart() + num1.getImaginPart() * num2.getImaginPart()) / denominator, 
        (num1.getImaginPart() * num2.getRealPart() - num1.getRealPart() * num2.getImaginPart()) / denominator); 
    }
    
}
