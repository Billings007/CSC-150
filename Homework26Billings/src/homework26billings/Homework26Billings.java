/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework26billings;

/**
 *
 * @author Parker
 */
public class Homework26Billings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
        int b[][] = {{-1,3},{0,9},{1,-11},{4,-5}};
        int c[][] = MatrixMult.mult(a, b);
        int rows = c.length;
        int cols = c[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.printf("%4d " , c[i][j]);
            }
            System.out.println();
        }
    }
    
}
