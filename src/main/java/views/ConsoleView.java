package views;

import java.util.Scanner;
import models.Matrix;

/**
 *
 * @author Luis Gerardo Leon Ortega
 */
public class ConsoleView {

    Scanner userInput = new Scanner(System.in);

    public void printInConsole(String text) {
        System.out.println(text);
    }

    public void printMatrixInConsole(Matrix matrix) {
        StringBuilder matrixBuilder = new StringBuilder();
        for (int posVertical = 0; posVertical < matrix.getWidth(); posVertical++) {
            for (int posHorizontal = 0; posHorizontal < matrix.getHeight(); posHorizontal++) {
                
                if (posHorizontal == 0) {
                    matrixBuilder.append("[");
                }
                
                matrixBuilder.append(matrix.getData()[posVertical][posHorizontal]);
                
                if ((posHorizontal + 1) == matrix.getHeight()) {
                    matrixBuilder.append("]");
                } else {
                    matrixBuilder.append(",");
                }
            }
            matrixBuilder.append("\n");
        }
        printInConsole(matrixBuilder.toString());
    }

    public int getUserInput() {
        return userInput.nextInt();
    }
}
