package main;

import controllers.MatrixController;
import models.Matrix;
import views.ConsoleView;

/**
 *
 * @author Luis Gerardo Leon Ortega
 */
public class main {

    public static void main(String[] args) {
        Matrix model = new Matrix();
        ConsoleView view = new ConsoleView();
        MatrixController controller = new MatrixController(model, view);

        controller.printMenu();
        
        switch (controller.getUserInput()) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
}
