package homework28;
public class LinearFunction implements LinearFunctionMethods{
    
    double slope;
    double yInt;
    double x;
    double y;
    double root;
    
    public LinearFunction(double m, double b){
        slope = m;
        yInt = b;
    }
    public double getSlope(){
        return slope;
    }


    public double getYintercept() {
        return yInt;
    }


    public double getRoot() {
        root = this.getXvalue(0);
        return root;
    }


    public double getYvalue(double x) {
        double yVal = slope*x + yInt;
        return yVal;
    }


    public double getXvalue(double y) {
        double xVal = (y-yInt)/(slope);
        return xVal;
    }
    
    
}
