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
public class Homework27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This begins a new account in which the initial balance is 200

        // and the interest rate is 5%.

        SavingsAccount myAccount = new SavingsAccount(200, 5);
        
        //Make a deposit...notice we use an inherited method, deposit

        myAccount.deposit(132.14);

        myAccount.addInterest( );

        myAccount.overdraftCharge(30.00);
        
        //Here, we use another inherited method getBalance();

        System.out.println( "Final balance is:" + myAccount.getBalance( ) );
    
}
    
}
