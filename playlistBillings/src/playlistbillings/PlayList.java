/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package playlistbillings;


//imports to allow many things to function
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author Parker Billings
 * This program allows you to 
 * make a playlist.
 */
public class PlayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create songList array to hold songs
        Song songList[] = new Song[3]; 
         
        //new scanner to read user input of song
        Scanner in = new Scanner(System.in); 
        for(int i = 0; i<3; i++){
        
        //ask for song title    
        System.out.println("Type the song title."); 
        String ttle = in.nextLine();
        
        //ask for song artist
        System.out.println("Type the song artist."); 
        String artst = in.nextLine();
        
        //ask for song length
        System.out.println("Type the song length (mm:ss)."); 
        String lngth = in.nextLine(); 
        String[] parts = lngth.split(":"); //split the string at colon
        String min = parts[0];
        String sec = parts[1];
        int mins = Integer.parseInt(min); //pasrse min and sec strings to ints
        int secs = Integer.parseInt(sec);
        int length = (mins*60) + secs; //create total time in seconds of song
        
        //ask for song file path
        System.out.println("Type the song file path."); 
        String path = in.nextLine();
        
        //put songs into songList array
        songList[i] = new Song(ttle,artst,length,path); 
        }
        
         //change decimal to only show 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        //calculate average seconds of playing
        double average = (songList[0].getPlayTime() + songList[1].getPlayTime() 
                + songList[2].getPlayTime())/3; 
        
        //print average play time
        System.out.println( "Average play time: " + average); 
        
        //check which song is closest to 4 minutes
        int close = 240; //4 minutes in seconds
        //check if song 1 is closest
        if(Math.abs(close - songList[0].getPlayTime()) <= 
                Math.abs(close - songList[1].getPlayTime())
                && 
                Math.abs(close - songList[0].getPlayTime()) <= 
                Math.abs(close - songList[2].getPlayTime()))
        {
            System.out.println("The song closest to 4 minutes is: " 
                    + songList[0].getTitle());
        }
        //check if song 2 is closest to 4 minutes
        if(Math.abs(close - songList[1].getPlayTime()) <= 
                Math.abs(close - songList[0].getPlayTime())
                && 
                Math.abs(close - songList[1].getPlayTime()) <= 
                Math.abs(close - songList[2].getPlayTime()))
        {
            System.out.println("The song closest to 4 minutes is: " 
                    + songList[1].getTitle());
        }
        //check if song 3 is closest to 4 minutes
        if(Math.abs(close - songList[2].getPlayTime()) <= 
                Math.abs(close - songList[1].getPlayTime())
                && 
                Math.abs(close - songList[2].getPlayTime()) <= 
                Math.abs(close - songList[0].getPlayTime()))
        {
            System.out.println("The song closest to 4 minutes is: " 
                    + songList[2].getTitle());
        }
        //if songs are all equal
        if(Math.abs(close-songList[1].getPlayTime()) == 
                Math.abs(close - songList[2].getPlayTime())
                &&
                Math.abs(close-songList[1].getPlayTime()) == 
                Math.abs(close - songList[0].getPlayTime()))
        {
            System.out.println("All the songs are the same length");
        }
        
        //code ordering in array: songList -- programmed in lambda expression
        Arrays.sort(songList, (Song o1, Song o2) -> o1.getPlayTime()
                -(o2.getPlayTime()));
        
       //code to print songs in order      
       for(int j = 0; j<3; j++)
        {
        System.out.println(songList[j].toString());
        }
       
       //code to play songs in order
       for(int j = 0; j<3; j++)
        {
        songList[j].playSong();
        }
    }   
}  



//C:\Users\Parker\Documents\NetBeansProjects\playlistBillings\sounds