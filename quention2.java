public class quention2 {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(
                        "A001",
                        "Ahmed",
                        1000);

        BankAccount account2 =
                new BankAccount(
                        "A002",
                        "anzal",
                        2000);


        account1.displayAccount();
        account2.displayAccount();


        account1.setBalance(1500);
        account2.setBalance(2500);


        System.out.println("After updating balance:");

        System.out.println();

        account1.displayAccount();
        account2.displayAccount();
    }
}