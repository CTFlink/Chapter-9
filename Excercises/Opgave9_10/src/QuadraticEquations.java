public class QuadraticEquations {
    private double a;
    private double b;
    private double c;

    QuadraticEquations(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
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

    double getDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }

    double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    boolean twoRoots(){
        return (getDiscriminant() > 0);
    }

    boolean oneRoot(){
        return (getDiscriminant() == 0);
    }
}
