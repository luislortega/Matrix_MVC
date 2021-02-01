package models;

import java.util.ArrayList;

/**
 * @author luislortega
 */
public class Matrix {

    private int[][] matrixData;

    public int[][] getData() {
        return this.matrixData;
    }

    public void setData(int[][] newData) {
        this.matrixData = newData;
    }

    public int getWidth() {
        return this.matrixData.length;
    }

    public int getHeight() {
        return this.matrixData[0].length;
    }

    public void matrixSum(Matrix secondMatrix) {
        for (int posVertical = 0; posVertical < getWidth(); posVertical++) {
            for (int posHorizontal = 0; posHorizontal < getHeight(); posHorizontal++) {
                this.matrixData[posVertical][posHorizontal] = this.matrixData[posVertical][posHorizontal] + secondMatrix.getData()[posVertical][posHorizontal];
            }
        }
    }

    public void scalarMultiplication(int scalar) {
        for (int posVertical = 0; posVertical < getWidth(); posVertical++) {
            for (int posHorizontal = 0; posHorizontal < getHeight(); posHorizontal++) {
                this.matrixData[posVertical][posHorizontal] = this.matrixData[posVertical][posHorizontal] * scalar;
            }
        }
    }

    public void matrixMultiplication(Matrix secondMatrix) {
        int[][] matrixRepresentation = new int[getWidth()][secondMatrix.getHeight()];
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < secondMatrix.getHeight(); j++) {
                for (int k = 0; k < getHeight(); k++) {
                    matrixRepresentation[i][j] += this.matrixData[i][k] * secondMatrix.getData()[k][j];
                }
            }
        }
        setData(matrixRepresentation);
    }

    public void detFormula() {

    }

    public static double determinante(double[][] matriz) {
        double det;
        if (matriz.length == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
            return det;
        }
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            double[][] nm = new double[matriz.length - 1][matriz.length - 1];
            for (int j = 0; j < matriz.length; j++) {
                if (j != i) {
                    for (int k = 1; k < matriz.length; k++) {
                        int indice = -1;
                        if (j < i) {
                            indice = j;
                        } else if (j > i) {
                            indice = j - 1;
                        }
                        nm[indice][k - 1] = matriz[j][k];
                    }
                }
            }
            if (i % 2 == 0) {
                suma += matriz[i][0] * determinante(nm);
            } else {
                suma -= matriz[i][0] * determinante(nm);
            }
        }
        return suma;
    }

    public void detSarus() {

    }

    public void detGauss() {

    }

}
