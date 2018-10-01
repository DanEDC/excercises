package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = customerList;
    }


    public boolean addCustomerToBranch(Customer customer) {
        for (int i = 0; i < this.customerList.size(); i++) {
            if (this.customerList.get(i).getName().equals(customer.getName())) {
                System.out.println("Customer " + customer.getName() + " is already registered in the Branch " + this.branchName);
                return false;
            } else {
                this.customerList.add(customer);
                System.out.println("Customer " + customer.getName() + " has been registered in the Branch " + this.branchName +
                        " with initial transaction value: " + customer.getInitialTransactionValue());
            }
        }
        return true;
    }

    public boolean addTransactionToBranch(Customer customer, double transactionValue) {
        for (int i = 0; i < this.customerList.size(); i++) {
            if (this.customerList.get(i).getName().equals(customer.getName())) {
                customer.addTransaction(transactionValue);
                System.out.println("New transaction " + transactionValue + " has been added to Customer account " + customer.getName() +
                        " at Branch " + this.branchName);
                return true;
            } else {
                System.out.println("Customer " + customer.getName() + " is not registered in the Branch " + this.branchName);
            }
        }
        return false;
    }

    public void printCustomerList(Branch branch) {
        for (int i = 0; i < this.customerList.size(); i++) {
            System.out.println((i + 1) + ". " + this.customerList.get(i).getName()
                    + ", " + this.customerList.get(i).getTransactions());
        }
    }


    public String getBranchName() {
        return branchName;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                ", customerList=" + customerList +
                '}';
    }
}


