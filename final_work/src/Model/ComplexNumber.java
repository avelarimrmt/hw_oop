package Model;

/** Базовый класс комплексного числа */
public class ComplexNumber {
    /** действительная часть числа */
    private double realPart;

    /** мнимая часть числа */
    private double imaginPart;

    /**
     * конструктор коплексного числа 2 параметра
     * @param realPart действительная часть числа
     * @param imaginPart мнимая часть числа
     */
    public ComplexNumber(double realPart, double imaginPart) {
        this.realPart = realPart;
        this.imaginPart = imaginPart;
    }

    /** получить действительнкую часть числа */
    public double getRealPart() {
        return realPart;
    }

    /** получить мнимую часть числа */
    public double getImaginPart() {
        return imaginPart;
    }

    /** переопределение вывода комплексного числа*/
    @Override
    public String toString() {
        if (imaginPart >= 0) {
            return realPart + " + " + imaginPart + "i";
        } else {
            return realPart + " - " + (-imaginPart) + "i";
        }
    }
}