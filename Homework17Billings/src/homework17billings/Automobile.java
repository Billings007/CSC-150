/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17billings;

/**
 *
 * @author Parker
 */
public class Automobile {
    public double mpg;
    public double gallons;
    
    public Automobile(int m){
        mpg=m;
        gallons=0;
    }
    public fillUp(double gas){
        gallons= gas + gallons;
    }
    public takeTrip(double drive){
        gallons= gallons- drive/mpg;
    }
    public reportFuel(){
        System.out.println(gallons);
    }
}
