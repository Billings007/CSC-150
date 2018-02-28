/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package textstatistics;

import java.io.File;

/**
 *
 * @author Parker
 */
public class ProcessStatistics {
    
    public static void main(String [] args){ 
        

        
        if(args.length < 1){
            System.out.println("Usage:ProcessText file1 [file2...]"); 
        }else{

            for(String arg : args){ 
                File file = new File(arg); 
                TextStatistics ts = new TextStatistics(file); 
                                    
                if(file.exists()){ 
                   // System.out.println(ts.getLineCount());
                    //System.out.println(ts.getWordCount());
                    //System.out.println(ts.getCharCount()); 
                    //System.out.println(ts.getLetterCount());
                    //System.out.println(ts.getAverageWordLength());
                    System.out.println(ts);
                }
                
            }
            
        } 
        
    }
    
}
