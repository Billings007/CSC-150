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
public class Homework17Billings {

    public static void main(String[] args) {
       //Create a new object called myBmw. Pass the constructor as

//an argument of 24 miles per gallon.

Automobile myBmw = new Automobile(24);



//Use the myBmw object to call the fillup method. Pass it as

//an arguemtn of 20 gallons

myBmw.fillUp(20);



//Use the myBmw object to call the takeTrip method. Pass it an

//argument of 100 miles. Driving 100 miles of course uses fuel

//and we would now find less fuel in the tank

myBmw.takeTrip(100);



//Use the myBmw object to call the reportFuel method. It returns a

//double value of the amount fo gas left in the tank and this is

//assigned to the variable fuel_left


myBmw.reportFuel();



//Print the fuel_left variable


    }
}
