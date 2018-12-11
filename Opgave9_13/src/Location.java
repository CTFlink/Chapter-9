/**
 * @author Dalphs
 * @version 1.0
 *
 *
 */

public class Location {
    public int row;
    public int column;
    public double maxValue;

    Location(int row, int column, double maxValue){

        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location location(double[][] a){
        int row = 0;
        int column = 0;
        double maxValue = a[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(maxValue < a[i][j]){
                    row = i;
                    column = j;
                    maxValue = a[i][j];
                }
            }
        }
        return new Location(row, column, maxValue);
    }
}
