import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        GregorianCalendar greg = new GregorianCalendar();

        System.out.println("Current year: " + greg.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + greg.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + greg.get(GregorianCalendar.DAY_OF_MONTH));

        greg.setTimeInMillis(1234567898765L);

        System.out.println("Custom year: " + greg.get(GregorianCalendar.YEAR));
        System.out.println("Custom month: " + greg.get(GregorianCalendar.MONTH));
        System.out.println("Custom day: " + greg.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
