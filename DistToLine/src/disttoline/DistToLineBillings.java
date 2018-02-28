/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disttoline;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

/**
 *
 * @author Parker
 */
public class DistToLineBillings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner stInput = new Scanner(System.in);
        
        //set line coordiantes
        //A
        System.out.println("Give point A's coordinate.");
        Homework22Billings.A = parseDouble(stInput.nextLine());
        //B
        System.out.println("Give point B's coordinate.");
        Homework22Billings.B = parseDouble(stInput.nextLine());
        //C
        System.out.println("Give point C's coordinate.");
        Homework22Billings.C = parseDouble(stInput.nextLine());
        
        //get a & b coordinates
        //a
        System.out.println("Give a x coordiante location");
        double a = parseDouble(stInput.nextLine());
        //b
        System.out.println("Give a y coordiante location");
        double b = parseDouble(stInput.nextLine());
        
        //print distance
        System.out.println(Homework22Billings.getDist(a, b));
    }
    
}
