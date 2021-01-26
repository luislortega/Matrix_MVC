package controllers;

import models.Matrix;
import views.ConsoleView;

/**
 *
 * @author Luis Gerardo Leon Ortega
 */

public class MatrixController {
    
    Matrix model;
    ConsoleView view;
    
   public MatrixController(Matrix model, ConsoleView view){
       this.model = model;
       this.view = view;
   }
   
   public void printMenu(){
       view.printInConsole(">= Bienvenido a Matrix MCV <= \n "
                + "Integrantes: Luis Gerardo Leon Ortega \n "
                + "-= Opciones =- \n"
                + "1) Suma de matrices \n"
                + "2) Multiplicacion de matrices por un escalar \n"
                + "3) Multiplicacion de matrices \n"
                + "4) Inversa de una matriz con Gauss-Jordan \n"
                + "5) Solución de un sistema de ecuaciones por el método de Gauss-Jordan \n"
                + "6) Obtención del determinante de una matriz \n"
                + "7) Solución de un sistema de ecuaciones por el método de Cramer");
   }
}
