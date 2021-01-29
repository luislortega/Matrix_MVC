package main;

import controllers.MatrixController;
import java.util.Scanner;
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
        controller.getUserOption();
        controller.printResult();
    }
}
