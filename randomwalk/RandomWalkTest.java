//package randomwalk;

//import java.util.Scanner;

import java.util.Scanner;

/**
 * @author: Parker Billings
 */
public class RandomWalkTest
{
     private static int gridSize = 0;
     private static long seed = 0;
     private static Scanner input= new Scanner(System.in);
     /**
      * 
      */
     private static void getInput() 
     {
        
         do
        {
            System.out.print("Enter grid size (>0) : ");
            gridSize = input.nextInt();
            
        }
        while (gridSize <= 0);
        
        do
        {
            System.out.print("Enter random seed (or 0 for no seed) : ");
            seed = input.nextLong();
            
        }
        while (seed<0);
     }
     
     
     /**
      * @param args
      */
     public static void main(String[] args)
     {
        getInput();
        
        
        RandomWalk myWalk;
        if(seed == 0){
            myWalk = new RandomWalk(gridSize);
        }
        else{
            myWalk = new RandomWalk(gridSize, seed);
            
        }
        
        myWalk.createWalk();
        System.out.println(myWalk.toString());
     }
}
