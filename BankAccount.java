
public class BankAccount {

    private String accountNumber;
    private String customerName;
    private double balance;

    public BankAccount(String accountNumber,
                       String customerName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void displayAccount() {

        System.out.println("Account Number: "
                + accountNumber);

        System.out.println("Customer Name: "
                + customerName);

        System.out.println("Balance: "
                + balance);

        System.out.println();
    }
}