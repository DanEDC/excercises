package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Customer {

  private String name;
  double transactionValue;

  private ArrayList<Double> transactions = new ArrayList<>();

  public Customer(String name, double transactionValue) {
    this.name = name;
    this.transactions.add(Double.valueOf(transactionValue));
  }

  public Customer(double transactionValue) {
    this.transactions.add(Double.valueOf(transactionValue));
  }

  public String getName() {
    return name;
  }

  public double getTransactionValue() {
    return transactionValue;
  }
}
