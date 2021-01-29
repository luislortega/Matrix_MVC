package main;

import java.util.Scanner;

/**
 *
 * @author Luis Gerardo Leon Ortega
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        StringBuilder output2 = new StringBuilder();

        System.out.println("Bienvenido a Matrix MVC \n "
                + "Opciones \n "
                + "1) Suma de matrices \n "
                + "2) Multiplicacion de matrices por un escalar \n "
                + "3) Multiplicacion de matrices \n "
                + "4) Obtencion de la inversa de una matriz por el metodo de Gauss-Jordan \n"
                + "5) Solucion de un sistema de ecuacion por el metodo de Gauss-Jordan \n"
                + "6) Obtencion del determinante de una matriz \n "
                + "7) Solucion de un sistema de ecuaciones por el metodo de Cramer \n"
                + "8) Escoge tu opcion... \n ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                int anchura;
                int altura;
                System.out.println("Escoge la anchura de tus matrices ");
                anchura = input.nextInt();
                System.out.println("Escoge la altura de tus matrices");
                altura = input.nextInt();
                
                int[][] matrix = new int[anchura][altura];
                int[][] matrix2 = new int[anchura][altura];
                
                System.out.println("Ingresa los valores de las dos matrices en orden...");
                for (int i = 0; i < anchura; i++) {
                    for (int j = 0; j < altura; j++) {
                        matrix[i][j] = input.nextInt();
                        if(j == 0){
                            output.append("[");
                        }
                        output.append(matrix[i][j]);
                        if( (j+1) == altura){
                            output.append("]");
                        }else{
                            output.append(",");
                        }
                    }
                    output.append("\n");
                }
                for (int i = 0; i < anchura; i++){
                     for (int j = 0; j < altura; j++) {
                        matrix2[i][j] = input.nextInt();
                        if(j == 0){
                            output2.append("[");
                        }
                        output2.append(matrix[i][j]);
                        if( (j+1) == altura){
                            output2.append("]");
                        }else{
                            output2.append(",");
                        }
                    }
                    output2.append("\n");
                }
                
                System.out.println("\n"+output);
                System.out.println("( + )");
                System.out.println(output2+"\n");
                break;
            case 2:
                /* TO-DO*/
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
