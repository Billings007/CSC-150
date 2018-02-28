package bankaccount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Parker
 */
public class BankAccount {
    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount(1000, "Sally Jones");
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        
    }
}
