import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.printf("%-3d", rand.nextInt(100));
            if(i % 10 == 9){
                System.out.println();
            }
        }

    }
}
