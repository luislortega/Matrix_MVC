package views;

import java.util.Scanner;
import models.Matrix;

/**
 *
 * @author Luis Gerardo Leon Ortega
 */
public class ConsoleView {

    Scanner userInput = new Scanner(System.in);
    StringBuilder matrixBuilder = new StringBuilder();

    public void printInConsole(String text) {
        System.out.println(text);
    }

    public void printMatrixInConsole(Matrix matrix) {
        for (int i = 0; i < matrix.getWidth(); i++) {
            for (int j = 0; j < matrix.getHeight(); j++) {
                /*
                if (j == 0) {
                    output2.append("[");
                }
                output2.append(matrix[i][j]);
                if ((j + 1) == altura) {
                    output2.append("]");
                } else {
                    output2.append(",");
                }*/
            }
            //output2.append("\n");
        }
    }

    public int getUserInput() {
        return userInput.nextInt();
    }
}
