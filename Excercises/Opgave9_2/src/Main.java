public class Main {

    public static void main(String[] args) {
        Stock orcl = new Stock("ORCL", "Oracle", 34.5, 34.35);

        System.out.printf("%.3f", orcl.getChangePercent());
        System.out.println(" %");
    }
}
