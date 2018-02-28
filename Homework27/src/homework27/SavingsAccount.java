/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework27;

/**
 *
 * @author Parker
 */
public class SavingsAccount extends BankAccount

{

private double overdraftCharge;
    
private double interestRate;

public SavingsAccount(double amount, double rate) //Constructor

{

super(amount); //Calls the constructor in

//BankAccount Superclass and sets balance

interestRate = rate;

}

public void addInterest( )

{

double interest = getBalance( ) * interestRate / 100;

deposit(interest);

}

public void overdraftCharge(double od){

overdraftCharge = od;

withdraw(overdraftCharge);

}

}