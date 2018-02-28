/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework21billlings;

/**
 *
 * @author Parker
 */
public class ShoppingList {
    
    private String name;
    private double price;
    
    public ShoppingList(String tempName,double tempPrice){
        name = tempName;
        price = tempPrice;       
    }
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
}