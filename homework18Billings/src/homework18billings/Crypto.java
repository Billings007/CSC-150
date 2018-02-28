/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework18Billings;

/**
 *
 * @author Parker Billings
 */
public class Crypto {
    
    public String input;
    
    Crypto(){
    
        
    }
    public String encrypt(String s){
        String encrypted="";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            switch(c){
                case 'V':
                case 'v':encrypted=encrypted+"ag',r";
                break;
                case 'm':
                case 'M':encrypted=encrypted+"ssad";
                break;
                case 'g':
                case 'G':encrypted+="jeb..w";
                break;
                case'b':
                case'B':encrypted+="dig>?/";
                break;
                default:encrypted+=s.charAt(i);      
            }
        }
        return encrypted;
    }
    public String decrypt(String s){
        String decrypted=s;
        decrypted=decrypted.replace("ag',r", "v");
        decrypted=decrypted.replace("dig>?/", "b");
        decrypted=decrypted.replace("jeb..w", "g");
        decrypted=decrypted.replace("ssad", "m");
        return decrypted;
    }
    
    
}
