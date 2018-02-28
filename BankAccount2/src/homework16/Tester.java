/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework16;

/**
 *
 * @author Parker
 */
public class Tester {
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount(1000, "Sally Jones");
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        myAccount.withdraw(100);
        System.out.println("The "+ myAccount.name +"account balance is,"+ myAccount.balance);
    }
}
