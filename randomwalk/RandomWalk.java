//package randomwalk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package randomwalk;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Parker Billings
 */
public class RandomWalk implements RandomWalkInterface {

    ArrayList<Point> path; //empty array list object

    private boolean isDone= false, next=false;
    private long seed;
    private int gridSize;
    private int x=0;
    private int y=0;
    Random random;
        
    public RandomWalk(int gridSize){
        this.gridSize=gridSize;
        path= new ArrayList<Point>();
        Point start =new Point(0,0);
        path.add(start);
        random= new Random(seed);
    }    
    public RandomWalk(int gridSize, long seed){
        this(gridSize);
        random= new Random(seed);
    }
        
    @Override
    public void step() {
        //Random rand = new Random();
        //int temp = random.nextInt(2);
        //for (int i = 0; i<1; i++){
        int stepX, stepY;
        stepX= (int)path.get(path.size()-1).getX();
        stepY=(int)path.get(path.size()-1).getY();    
        
        if(stepX<gridSize-1&&stepY<gridSize-1){
            if(random.nextInt(2)==1){
                path.add(new Point((int) path.get(path.size()-1).getX()+1, (int)path.get(path.size()-1).getY()));
            }
            else{
                path.add(new Point((int) path.get(path.size()-1).getX(), (int)path.get(path.size()-1).getY()+1));
            }
        }
        else if(stepX>=gridSize-1&&stepY<gridSize-1){
            path.add(new Point((int) path.get(path.size()-1).getX(), (int)path.get(path.size()-1).getY()+1));
        }
        else if(stepY>=gridSize-1&&stepX<gridSize-1){
            path.add(new Point((int) path.get(path.size()-1).getX()+1, (int)path.get(path.size()-1).getY()));
        }
        
    }

    @Override
    public void createWalk() {
        while (!isDone){
            step();
            isDone();
        }
    }

    @Override
    public boolean hasNext() {
        if (path.get(path.size()-1).getY()>=gridSize-1||path.get(path.size()-1).getX()>=gridSize-1){
            next=true;
        }
        return next;
    }

    @Override
    public boolean isDone() {
        if(path.get(path.size()-1).getY()>=gridSize-1&&path.get(path.size()-1).getX()>=gridSize-1){
            isDone= true;
        }
        else
            isDone = false;
        return isDone;
    }

    @Override
    public ArrayList<Point> getPath() {
        return path;
    }
    
    @Override
    public String toString(){
        String j = "";
        
        for(int i = 0; i<path.size(); i++){
            Point p = path.get(i);
            
            j+= "[" + p.x + "," + p.y + "]";
        }
        
        
        return j;
    }

    
    
}
