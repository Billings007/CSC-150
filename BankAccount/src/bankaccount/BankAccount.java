/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Parker
 */
class BankAccount {
    public double balance;
    public String name;
    
    public BankAccount(double b, String n){
        balance = b;
        name = n;
    }
    public deposit(double d){
        balance = d + balance;
    }
    public withdraw(double w){
        balance = balance - w;
    }
}
