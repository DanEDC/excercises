package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branchList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = new Branch(branchName);
        if (this.branchList.size() == 0) {
            this.branchList.add(branch);
            System.out.println("Branch " + branchName + " has been registered in the Bank " + this.bankName);
            return true;
        } else {
            for (int i = 0; i < this.branchList.size(); i++) {
                if (!this.branchList.get(i).getBranchName().equals(branchName)) {
                    this.branchList.add(branch);
                    System.out.println("Branch " + branchName + " has been registered in the Bank " + this.bankName);
                    return true;
                }
            }
            System.out.println("Branch " + branchName + " is already registered in the Bank " + this.bankName);
            return false;
        }
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double initialTransactionValue) {
        if (this.branchList.size() == 0) {
            System.out.println("Branch " + branchName + " is not found in Bank " + this.getBankName() + ". Please add Branch first");
            return false;
        } else {
            for (int i = 0; i < this.branchList.size(); i++) {
                if (this.branchList.get(i).getBranchName().equals(branchName)) {
                    this.branchList.get(i).addCustomerToBranch(customerName, initialTransactionValue);
                    return true;
                }
            }
        }
        System.out.println("Branch " + branchName + " is not found in Bank " + this.getBankName() + ". Please add Branch first");
        return false;
    }

    public boolean addTransactionToBranch(String branchName, String customerName, double transactionValue) {
        if (this.branchList.size() == 0) {
            System.out.println("Branch " + branchName + " is not found in Bank " + this.getBankName() + ". Please add Branch first");
            return false;
        } else {
            for (int i = 0; i < this.branchList.size(); i++) {
                if (this.branchList.get(i).getBranchName().equals(branchName)) {
                    this.branchList.get(i).addTransactionToBranch(customerName, transactionValue);
                    return true;
                }

            }
        }
        System.out.println("Branch " + branchName + " is not found in Bank " + this.getBankName() + ". Please add Branch first");
        return false;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", branchList=" + branchList +
                '}';
    }
}

