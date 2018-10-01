package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Customer {

  private String name;
  private double initialTransactionValue;

  private ArrayList<Double> transactions = new ArrayList<>();

  public Customer(String name, double initialTransactionValue) {
    this.name = name;
    this.initialTransactionValue = initialTransactionValue;
    this.transactions.add(initialTransactionValue);
  }

  public void addTransaction(double transactionValue) {
    this.transactions.add(transactionValue);

  }

  public String getName() {
    return name;
  }

  public ArrayList<Double> getTransactions() {
    return transactions;
  }

  public double getInitialTransactionValue() {
    return initialTransactionValue;
  }

  @Override
  public String toString() {
    return "transactions= " + transactions;
  }
}
