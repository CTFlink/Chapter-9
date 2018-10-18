import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d ,e and f: ");
        LinearEquation test = new LinearEquation(input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        if(test.isSolvable()){
            System.out.println("x is " + test.getX() + " and y is " + test.getY());
        }else{
            System.out.println("The equation has no solutions");
        }
    }
}
