/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework19Billings;
import java.io.*;
import java.util.*;
/**
 *
 * @author Parker Billings
 */
public class homework19Billings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        String s,sp[];
        Scanner kb = new Scanner(System.in);
            while(i!=1){
            s= kb.nextLine();
            s=s.toUpperCase();
            if (s.equals("EXIT")){
                System.exit(0);
            }
            else {
            
                s+=".";
                sp=s.split("S\\s*A");
                System.out.println("The number of instances of SA is "+((sp.length)-1));
            }
            }
    
    
    
    
    }
    
}
