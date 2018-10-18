import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] points = new double[8];

        getPoints(points);

        LinearEquation intersect = new LinearEquation(getA(points), getB(points),  getC(points),
                getD(points), getE(points), getF(points));


        if(intersect.isSolvable()){
            System.out.println("The two lines intersect at (" + intersect.getX() + ", " + intersect.getY() + ")");
        }else{
            System.out.println("The two lines are parallel");
        }

    }

    public static void getPoints(double[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
        }

    }

    public static double getA(double[] a){
        return a[1] - a[3];
    }
    public static double getB(double[] a){
        return - (a[0] - a[2]);
    }
    public static double getC(double[] a){
        return a[5] - a[7];
    }
    public static double getD(double[] a){
        return - (a[4] - a[6]);
    }
    public static double getE(double[] a){
        return getA(a) * a[0] + getB(a) * a[1];
    }
    public static double getF(double[] a){
        return getC(a) * a[4] + getD(a) * a[5];
    }
}
