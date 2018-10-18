public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("rectangle1 height, width, area and perimeter is: " + rectangle1.height + ", " + rectangle1.width
        + ", " + rectangle1.getArea() + ", " + rectangle1.getperimeter());
        System.out.println("rectangle2 height, width, area and perimeter is: " + rectangle2.height + ", " + rectangle2.width
                + ", " + rectangle2.getArea() + ", " + rectangle2.getperimeter());

    }
}
