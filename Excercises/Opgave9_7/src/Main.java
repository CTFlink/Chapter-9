public class Main {

    public static void main(String[] args) {
        Account test = new Account(1122, 20000, 4.75);
        test.withdraw(2500);
        test.deposit(3000);
        System.out.println("Balance: " + test.getBalance());
        System.out.println("Monthly interest " + test.getMonthlyInterest());
        System.out.println("The account was created on " + test.getDateCreated());
    }
}
