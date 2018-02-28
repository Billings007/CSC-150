/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disttoline;

/**
 *
 * @author Parker
 */
public class Homework22Billings {
    
    public static double A,B,C;
    
    public static double getDist(double a,double b){
        double dist = Math.abs(A*a + B*b + C)/Math.sqrt((A*A)+(B*B));
        return dist;
    }
    
}
