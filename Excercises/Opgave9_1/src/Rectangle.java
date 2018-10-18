public class Rectangle {
    double height;
    double width;

    public Rectangle(){
        height = 1;
        width = 1;
    }

    public Rectangle(double newHeight, double newWidth){
        height = newHeight;
        width = newWidth;
    }

    double getArea(){
        return width * height;
    }

    double getperimeter(){
        return 2 * height + 2 * width;
    }


}
