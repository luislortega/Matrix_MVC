package models;
import java.util.ArrayList; 

/**
 * @author luislortega
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
