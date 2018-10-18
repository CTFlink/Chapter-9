import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date1 = new Date();
        long time = 10000;
        for (long i = 0; i < 8; i++) {
            date1.setTime(time);
            System.out.println(date1.toString());
            time *= 10;
        }
        date1.setTime(System.currentTimeMillis());
        System.out.println(date1.toString());

    }
}
