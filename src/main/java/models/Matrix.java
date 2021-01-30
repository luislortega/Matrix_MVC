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
        for(int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < secondMatrix.getHeight(); j++) {
                for (int k = 0; k < getHeight(); k++) {
                    matrixRepresentation[i][j] += this.matrixData[i][k] * secondMatrix.getData()[k][j];
                }
            }
        }
        setData(matrixRepresentation);
    }

}
