public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    boolean isSolvable(){
        return (a * d - b * c != 0);
    }

    double getX(){
        double x = (e * d - b * f) / (a * d - b * c);
        return x;
    }

    double getY(){
        double y = (a * f - e * c) / (a * d - b * c);
        return y;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
}
