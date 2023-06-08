import Controllers.iGetView;
import Controllers.CalculatorController;
import Model.CalculatorModel;
import Model.ComplexNumber;
import Model.iCalculatorModel;
import View.View;


public class App {
    public static void main(String[] args) throws Exception {
        iCalculatorModel<ComplexNumber> model = new CalculatorModel();
        iGetView<ComplexNumber> view = new View();
        CalculatorController<ComplexNumber> controller = new CalculatorController<ComplexNumber>(model, view);
    }
}