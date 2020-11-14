package calc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Operations {

    private double x;
    private double y;


    public double sum(double x, double y){
        return x+y;
    }

    public double subtraction (double x, double y){
        return x-y;
    }

    public double multiplication(double x, double y){
        return x*y;
    }



    public double root(double x){
            double sqrt = Math.sqrt(x);
        return sqrt;
    }

    public double division (double x, double y){
        return x/y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void sumArray(double [] array){
        Arrays.stream(array).sum();
    }

}
