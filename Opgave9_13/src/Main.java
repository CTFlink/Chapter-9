import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        double[][] user = new double[input.nextInt()][input.nextInt()];

        fillTable(user);

        Location location = Location.location(user);

        System.out.println("The highest number is " + location.maxValue + " and it is located at [" +
                location.row + "][" + location.column + "]");
    }

    public static void fillTable(double[][] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
    }
}
