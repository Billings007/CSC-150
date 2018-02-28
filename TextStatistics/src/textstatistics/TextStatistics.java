/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package textstatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

        
/**
 *
 * @author Parker
 */
public class TextStatistics implements TextStatisticsInterface{
    //variables
    private File textFile;
    private Scanner fileScan;
    private int lineCount, charCount;
    private final String DELIMITERS = " ,.;:'\"&!?-_\n\t12345678910[]{}()@#$%^*/+-";
    private StringTokenizer tokenizer;
    private String results, line; 
    private int wordLength[], letterCount[];
    private double avgWordLength;
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private double totalWords, wordCount;
    
    public TextStatistics(File file){
        //file
        textFile = file;
        
        try
        {
            //Takes in File
            fileScan = new Scanner(textFile);
            wordLength = new int[24];
            letterCount = new int[26];
            
            //Counts lines and chars
            while(fileScan.hasNextLine()){
                lineCount++;
                //counts chars
                line = fileScan.nextLine();
                charCount += line.length()+1;
                tokenizer = new StringTokenizer(line,DELIMITERS);
                
                //counts letters
                for(int w = 0; w<line.length(); w++){
                    line = line.toLowerCase();
                    char letter = line.charAt(w);
                    int letterValue = (int)(letter)-97;
                    if(letterValue >= 0 && letterValue<=25){
                        letterCount[letterValue] += 1;
                    }
                    
                }
                //counts words and word lengths
                while(tokenizer.hasMoreTokens())
                {
                 String token = tokenizer.nextToken();
                 wordCount++;
                 //get Average word Length
                 totalWords += token.length();
                 avgWordLength = totalWords/wordCount;
                 if (token.length()>23){
                     wordLength[23]++;
                 }
                 else
                 wordLength[token.length()] += 1;
                }
               
            }            

            //catch statement for no file
        } catch (FileNotFoundException ex)
        {
            System.out.println("File cannot be located");
        }
    }
     
    
    

    @Override
    public int getCharCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return charCount;
    }

    @Override
    public int getWordCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (int) wordCount;
    }

    @Override
    public int getLineCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return lineCount;
    }

    @Override
    public int[] getLetterCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return letterCount;
    }

    @Override
    public int[] getWordLengthCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return wordLength;
    }

    @Override
    public double getAverageWordLength() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return avgWordLength;
    }

    @Override
    public String toString(){
        //prints lines
        String results = lineCount + " lines\n";
        //prints words
        results += wordCount + " words\n";
       //counts chars
        results += charCount + " characters\n";
        results += "----------------------------\n";
       //prints lettercount
        for(int i = 0; i<13;i++){
            results += alphabet[i] + " = " + letterCount[i] + "     " + alphabet[i + 13] + " = " + letterCount[i+13] + "\n";
            
        }
        
        results += "----------------------------\n";
        //prints wordlength
        results+= "length   frequency\n";
        results+= "------   ---------\n";
        for(int i = 1; i<wordLength.length;i++)
            if(wordLength[i] != 0){
                results+= i + "         " + wordLength[i] + "\n";
            }
        results += "\n";
        //prints average word length
        results += "Average word length = " + avgWordLength + "\n";
        return results;
    }
}
