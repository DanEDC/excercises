package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String bankName;
  private ArrayList<Branch> branchList = new ArrayList<Branch>();

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = branchList;
    }

    public void addBranch(Branch branch) {
        this.branchList.add(branch);
    }
}

//    public void addCustomerToBranch(Customer customer) {
//        for (int i = 0; i < this.branchList.size(); i++) {
//            if (!this.branchList.get(i).addCustomerToBranch(customer)) {
//                System.out.println("Customer " + customer.getName() + " is already registered in the Branch " + this.branchList.get(i));
//            } else {
//                this.branchList.get(i).addCustomerToBranch(customer);
//                System.out.println("Customer " + customer.getName() + " has been registered in the Branch " + this.branchList.get(i) +
//                        " with initial transaction value: " + customer.getInitialTransactionValue());
//            }
//        }
//    }
//
//    public void addTransactionToBranch(Customer customer, double transactionValue) {
//        for (int i = 0; i < this.branchList.size(); i++) {
//            if (this.branchList.get(i).addTransactionToBranch(customer, transactionValue)) {
//                customer.addTransaction(transactionValue);
//                System.out.println("New transaction " + transactionValue + " has been added to Customer account " + customer.getName() +
//                        " at Branch " + this.branchList.get(i));
//            } else {
//                System.out.println("Customer " + customer.getName() + " is not registered in the Branch " + this.branchList.get(i));
//            }
//
//        }
//    }

//    public void printCustomersFromBranch(Branch branch) {
//        for (int i = 0; i < this.branchList.size(); i++) {
//            if (this.branchList.get(i).equals(branch.getBranchName())) {
//                branch.printCustomerList(branch);
//            } else {
//                System.out.println("The Branch is not exists in the Bank");
//            }
//        }
//    }
//
//}

