/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework29;

/**
 *
 * @author Parker
 */
public class Homework29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /*

* precondition: amount <= balance

* precondition: amount > 0

*/

public void withdraw(double amount)

{
try{
if (amount > balance)

{

/*String s = "Can't withdraw more than the balance";

IllegalArgumentException e = new

IllegalArgumentException(s);

throw e; //Presents the s message and the entire program stops*/

}

if (amount <= 0)

{

/*String s = "Withdrawl amount must be greater tahn 0.";

IllegalArgumentException e = new

IllegalArgumentException(s);
throw e; //Presents the s message and the entire program stops*/

}
}
catch(IllegalArgumentException e){
    System.out.println("Can't withdraw more than the balance");
}
catch (IllegalArgumentException er){
    System.out.println("Can't withdraw more than the balance");
}
}
}
if (amount > balance)

{


String s = "Can't withdraw more than the balance";

IllegalArgumentException e = new

IllegalArgumentException(s);

throw e; //Presents the s message and the entire program stops*/

}