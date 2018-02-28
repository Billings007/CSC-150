package homework28;
/**
 * Abstract Classes and Interfaces
 * @author Parker
 * You can prohibit some classes from creating objects by making that class an
 * abstract class.
 * We can create abstract methods as well that cannot be accessed
 * Interfaces: make the code abstract and public
 *      To extend interfaces, we "implement" instead of "extend"
 * "instanceof" is a boolean to see if an object is a certain type
 */
import java.util.*;

public class Homework28 {
    public static void main(String[] args) {
    Scanner kbReader = new Scanner(System.in);
    System.out.print("What is the slope of your line? ");
    double slope = kbReader.nextDouble();
    System.out.print("What is the y-intercept of your line? ");
    Double yIntc = kbReader.nextDouble();
    LinearFunction line = new LinearFunction(slope, yIntc);
    System.out.println("\nSlope of this line is: " + line.getSlope());
    System.out.println("Y-intercept of this line is: " + line.getYintercept());
    System.out.println("Root of this line is: " + line.getRoot());
    System.out.print("\nWhat is an x value for which you wish to solve for y? ");
    double x = kbReader.nextDouble();
    double yValue = line.getYvalue(x);
    System.out.println("The y value corresponding to x = "+x+" is "+yValue);
    System.out.println("\nWhat is the y value for which you wish to solve for x? ");
    double y = kbReader.nextDouble();
    double xValue = line.getXvalue(y);
    System.out.println("The x value corresponding to y = " +y+ " is " +xValue);      
        
    }//end args
}//end class
