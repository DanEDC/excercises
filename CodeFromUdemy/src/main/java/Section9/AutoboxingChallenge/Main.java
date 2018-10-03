package Section9.AutoboxingChallenge;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Paribas");
        bank.addBranch("VIP");
        bank.addCustomerToBranch("VIP", "Daniel", 56.09);
        bank.addTransactionToBranch("VIP", "Daniel", 66.66);
        bank.addBranch("SuperVIP");
        bank.addCustomerToBranch("SuperVIP", "Kasia", 100.00);
        bank.addCustomerToBranch("SuperVIP", "Kasia", 444.90);
        bank.addTransactionToBranch("SuperVIP", "Daniel", 66.66);

        System.out.println(bank);
    }
}
