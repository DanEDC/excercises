package Section7.ConstructorsChallenge;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(123456, 500, "Customer", "customer@email.com", "123456");
        System.out.println("Constructor has been created");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int deposit(int money) {
        this.balance += money;
        return balance;
    }

    public int withdraw(int money) {
        if (money <= balance) {
            this.balance -= money;
            return balance;
        } else {
            System.out.println("You have only this amount of money on the account - " + balance);
            return -1;
        }
    }
}
