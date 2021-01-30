package models;
import java.util.ArrayList; 

/**
 * @author luislortega
 */

public class Matrix {
    
    private int[][] matrixData;
    
    public int[][] getData(){
        return this.matrixData;
    }
    
    public void setData(int[][] newData){
        this.matrixData = newData;
    }
    
    public int getWidth(){
        return this.matrixData.length;
    }
    
    public int getHeight(){
        return this.matrixData[0].length;
    }
    
    public void matrixSum(Matrix secondMatrix){
        for (int posVertical = 0; posVertical < getWidth(); posVertical++) {
            for (int posHorizontal = 0; posHorizontal < getHeight(); posHorizontal++) {
                this.matrixData[posVertical][posHorizontal] = this.matrixData[posVertical][posHorizontal] + secondMatrix.getData()[posVertical][posHorizontal]; 
            }
        }
    }
}
