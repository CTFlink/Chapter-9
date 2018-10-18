import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquations test = new QuadraticEquations(a, b, c);

        if(test.twoRoots()){
            System.out.println("Root 1 is " + test.getRoot1());
            System.out.println("Root 2 is " + test.getRoot2());
        } else if(test.oneRoot()){
            System.out.println("The root is " + test.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
