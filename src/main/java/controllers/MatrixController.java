package controllers;

import models.Matrix;
import views.ConsoleView;

/**
 * @author luislortega
 */
public class MatrixController {

    private Matrix model;
    private ConsoleView view;

    public MatrixController(Matrix model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void printMenu() {
        view.printInConsole("Bienvenido a Matrix MVC \n \n "
                + "Opciones \n \n "
                + "1) Suma de matrices \n "
                + "2) Multiplicacion de matrices por un escalar \n "
                + "3) Multiplicacion de matrices \n "
                + "4) Obtencion de la inversa de una matriz por el metodo de Gauss-Jordan \n"
                + "5) Solucion de un sistema de ecuacion por el metodo de Gauss-Jordan \n"
                + "6) Obtencion del determinante de una matriz \n "
                + "7) Solucion de un sistema de ecuaciones por el metodo de Cramer \n \n"
                + "=> Escoge tu opcion... \n");
    }

    public void startProgram() {
        int userOption = view.getUserInput();
        view.printInConsole("=> Por favor escoge la anchura de tu matriz \n");
        int matrixWidth = view.getUserInput();
        view.printInConsole("=> Por favor escoge la altura de tu matriz \n");
        int matrixHeight = view.getUserInput();
        view.printInConsole("=> Ingresa los valores de tu matriz en orden \n");
        this.model = getMatrix(matrixWidth, matrixHeight);
        /*
        Matrix ejemplo = new Matrix();
        ejemplo.startMatrix(1, 2);
        view.printInConsole("width:"+ejemplo.getData().length);
        view.printInConsole("heigth:"+ejemplo.getData()[0].length);
         */
        switch (userOption) {
            case 1:
                /*
                restrictions and conditions you must meet.
                need have the same dimentions....
                */
                view.printInConsole("=> ingresa los valores de tu segunda matriz en orden \n");
                Matrix secondMatrix = getMatrix(matrixWidth, matrixHeight); 
                matrixSum(secondMatrix);
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
    
    public void matrixSum(Matrix matrix){
        this.view.printMatrixInConsole(matrix);
        this.model.matrixSum(matrix);
    }
    
    public void scalarMultiplication(){
    
    }
    
    public void matrixMultiplication(){
    
    }
    
    public void matrixReverseGauss(){
    
    }
    
    public void ecuationSystemGauss(){
    
    }
    
    public void matrixDeterminant(){
    
    }
    
    public void ecuationSystemCramer(){
    
    }

    public Matrix getMatrix(int matrixWidth, int matrixHeight) {
        int[][] matrixRepresentation = new int[matrixWidth][matrixHeight];
        for (int posVertical = 0; posVertical < matrixWidth; posVertical++) {
            for (int posHorizontal = 0; posHorizontal < matrixHeight; posHorizontal++) {
                view.printInConsole("["+posVertical+"]["+posHorizontal+"]: ");
                matrixRepresentation[posVertical][posHorizontal] = view.getUserInput();
            }
        }
        Matrix matrix = new Matrix();
        matrix.setData(matrixRepresentation);
        return matrix;
    }

    public void printResult() {

    }
}
