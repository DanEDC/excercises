package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Customer {

  private String name;
  private double initialTransactionValue;
  private ArrayList<Double> transactions;

  public Customer(String name, double initialTransactionValue) {
    this.name = name;
    this.initialTransactionValue = initialTransactionValue;
    this.transactions = new ArrayList<>();
    this.transactions.add(initialTransactionValue);
  }

  public void addTransaction(double transactionValue) {
    this.transactions.add(transactionValue);

  }

  public String getName() {
    return name;
  }

  public double getInitialTransactionValue() {
    return initialTransactionValue;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "name='" + name + '\'' +
            ", transactions=" + transactions +
            '}';
  }

}
