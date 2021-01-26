package views;

import java.util.Scanner;

/**
 *
 * @author Luis Gerardo Leon Ortega
 */

public class ConsoleView {
    
    Scanner userInput = new Scanner(System.in);
    
    public void printInConsole(String text) {
        System.out.println(text);
    }
    
    public int getUserInput(){
        return userInput.nextInt();
    }
}
