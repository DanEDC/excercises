package Section7.ConstructorsChallenge;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        BankAccount danielAccount = new BankAccount(123456, 1000, "Daniel", "daniel123@gmail.com", "+44 6777888");

        //account.setBalance(200);

        account.deposit(50);

        System.out.println(account.getBalance());

        account.withdraw(100);

        System.out.println(account.getBalance());

        danielAccount.withdraw(200);

        System.out.println(danielAccount.getBalance());

        VipCustomer firstVip = new VipCustomer();
        VipCustomer secondVip = new VipCustomer(200.58);
        VipCustomer thirdVip = new VipCustomer("Czeslaw", 155.99, "czeslaw@gmail.com");

        System.out.println(firstVip.getCreditLimit());
        System.out.println(secondVip.getCreditLimit());
        System.out.println(thirdVip.getEmailAddress());
    }
}
