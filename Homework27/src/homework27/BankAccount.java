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
public abstract class BankAccount {
   
public abstract void overdraftCharge(double db);
    
private double balance;

public BankAccount(double amt) //Constructor

{

balance = amt;

}

public double getBalance( )

{

return balance;

}

public void deposit(double d)

{

balance += d;

}

public void withdraw(double d)

{

balance -=d;

}

}
