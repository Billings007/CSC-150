/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework18Billings;
import java.io.*;
import java.util.*;
/**
 *
 * @author Parker Billings
 */
public class homework18Billings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kbReader = new Scanner(System.in);
        String sen ="Enter a sentence that is to be encrypted";
        System.out.println(sen);
        String sntnc = kbReader.nextLine();
        System.out.println("Original sentence = "+sntnc);
        
        Crypto myCryptObj = new Crypto();
        String encryptedSntnc= myCryptObj.encrypt(sntnc);
        System.out.println("Encrypted sentence = " + encryptedSntnc);
        
        String decryptdSntnc= myCryptObj.decrypt(encryptedSntnc);
        System.out.println("Decrypted Sentence = "+decryptdSntnc);
        
        
        
    }
    
}
