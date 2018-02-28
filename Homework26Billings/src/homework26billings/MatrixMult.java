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
class MatrixMult {
   
    public static int[][] mult(int a[][], int b[][]){
        if(a.length == 0) return new int[0][0];
        if(a[0].length != b.length) return null; 
        
        int n = a[0].length;
        int m = a.length;
        int p = b[0].length;
        int ans[][] = new int[m][p];

        for(int i = 0;i < m;i++){
            for(int j = 0;j < p;j++){
                for(int k = 0;k < n;k++){
                 ans[i][j] += a[i][k] * b[k][j];
                 }
             }
         }
        return ans;
        }
}
