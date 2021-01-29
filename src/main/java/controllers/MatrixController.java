package controllers;

import models.Matrix;
import views.ConsoleView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class MatrixController {
    private Matrix model;
    private ConsoleView view;
    
    public MatrixController(Matrix model, ConsoleView view){
        this.model = model;
        this.view = view;
    }
    
    public void printMenu(){
        view.printInConsole("Bienvenido a Matrix MVC \n \n "
                + "Opciones \n \n "
                + "1) Suma de matrices \n "
                + "2) Multiplicacion de matrices por un escalar \n "
                + "3) Multiplicacion de matrices \n "
                + "4) Obtencion de la inversa de una matriz por el metodo de Gauss-Jordan \n"
                + "5) Solucion de un sistema de ecuacion por el metodo de Gauss-Jordan \n"
                + "6) Obtencion del determinante de una matriz \n "
                + "7) Solucion de un sistema de ecuaciones por el metodo de Cramer \n \n"
                + "Escoge tu opcion... \n \n ");
    }
    
    public void getUserOption(){
        int userOption = view.getUserInput();
        switch (userOption){
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
    
    public void printResult(){
    
    }
}
