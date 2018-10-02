package Section9.AutoboxingChallenge;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Paribas");

        Branch branch = new Branch("VIP");
        branch.addCustomerToBranch("Daniel", 66.09);
        branch.addCustomerToBranch("Kasia", 100.13);
        branch.addTransactionToBranch("Daniel", 44.90);

        System.out.println(branch);


    }
}
