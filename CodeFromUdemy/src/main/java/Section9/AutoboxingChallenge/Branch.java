package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }

    public boolean addCustomerToBranch(String name, double initialTransactionValue) {
        Customer customer = new Customer(name, initialTransactionValue);
        if (this.customerList.size() == 0) {
            this.customerList.add(customer);
            System.out.println("Customer " + customer.getName() + " has been registered in the Branch " + this.branchName +
                    " with initial transaction value: " + customer.getInitialTransactionValue());
            return true;
        } else {
            for (int i = 0; i < this.customerList.size(); i++) {
                if (this.customerList.get(i).getName().equals(customer.getName())) {
                    System.out.println("Customer " + customer.getName() + " is already registered in the Branch " + this.branchName);
                    return false;

                } else {
                    this.customerList.add(customer);
                    System.out.println("Customer " + customer.getName() + " has been registered in the Branch " + this.branchName +
                            " with initial transaction value: " + customer.getInitialTransactionValue());
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addTransactionToBranch(String name, double transactionValue) {
        Customer customer = new Customer(name, transactionValue);
        for (int i = 0; i < this.customerList.size(); i++) {
            if (this.customerList.get(i).getName().equals(name)) {
                this.customerList.get(i).addTransaction(transactionValue);
                System.out.println("New transaction " + transactionValue + " has been added to Customer account " + name +
                        " at Branch " + this.branchName);
                return true;

            }
        }
        if (!this.customerList.contains(customer.getName())) {
            System.out.println("Customer " + name + " is not registered in the Branch " + this.branchName);
            return false;
        }
        return false;
    }



    public String getBranchName() {
        return branchName;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + this.branchName + '\'' +
                ", customerList=" + this.customerList +
                '}';
    }


}


