/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework21billlings;

import java.util.Scanner;

/**
 *
 * @author Parker
 */
public class Homework21Billlings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner shopMe = new Scanner(System.in);
        
        //get length of ShoppingList array
        System.out.println("Please specify a shopping list length");
        int lengthShop = Integer.parseInt(shopMe.nextLine());
        
        //create scanner with Length specified
        ShoppingList list1[] = new ShoppingList[lengthShop];
        
        for(int i = 0; i<list1.length; i ++){
            System.out.println("Please enter the name of the item.");
            String itm = shopMe.nextLine();
            
            System.out.println("Please enter the price of the item.");
            double prce = Double.parseDouble(shopMe.nextLine());
            
            list1[i] = new ShoppingList (itm,prce);
        }
        
      //sort least to greatest\
      System.out.println(list1.length);
        ShoppingList temp;
      /*  int i = 0;
        int j = i+1;
        while(i < list1.length){
             if ( (list1[i].getPrice() > list1[j].getPrice()) && (i != j) ) {
                    temp = list1[j];
                    list1[j] = list1[i];
                    list1[i] = temp;
                    
                }
             j++;
             i++;
        }*/
        //for to iterate through
        for (int i = 0; i < list1.length; i++) {
            for (int j = i+1; j < list1.length; j++) {
                //actually sorts least to greatest
                if ( (list1[i].getPrice() > list1[j].getPrice()) && (i != j) ) {
                    temp = list1[j];
                    list1[j] = list1[i];
                    list1[i] = temp;
                }
            }
        }
        
        //print the array
        for (ShoppingList list11 : list1) {
            System.out.println(list11.getName() + " " + list11.getPrice());
        }       
    }
    
}
