public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon(){
    }

    RegularPolygon(int newN, double newSide){
        n = newN;
        side = newSide;
    }

    RegularPolygon(int newN, double newSide, double newX, double newY){
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    double getPerimeter(){
        return side * n;
    }

    double getArea(){
        double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        return area;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
