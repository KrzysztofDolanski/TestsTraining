package calc;

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
}
