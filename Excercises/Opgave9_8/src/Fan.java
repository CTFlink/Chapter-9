public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
    }

    void toString1(){
        if(on){
            System.out.println("Speed of fan is " + speed + ", the color is " + color + " and the radius is " + radius + ".");
        } else{
            System.out.println("The fan is " + color + " and has radius " + radius + ".");
            System.out.println("The fan is off.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
