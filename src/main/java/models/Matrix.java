/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList; 

/**
 *
 * @author luis_
 */
public class Matrix {
    
    private int[][] matrixData;
    
    public void startMatrix(int width, int height){
        this.matrixData = new int[width][height];
    }
    
    public int[][] getData(){
        return this.matrixData;
    }
    
    public void setData(int[][] newData){
        this.matrixData = newData;
    }
}
