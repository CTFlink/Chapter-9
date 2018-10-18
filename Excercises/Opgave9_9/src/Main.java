public class Main {

    public static void main(String[] args) {
        RegularPolygon reg1 = new RegularPolygon();
        RegularPolygon reg2 = new RegularPolygon(6, 4);
        RegularPolygon reg3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(reg1.getArea() + " " + reg1.getPerimeter());
        System.out.println(reg2.getArea() + " " + reg2.getPerimeter());
        System.out.println(reg3.getArea() + " " + reg3.getPerimeter());
    }
}
