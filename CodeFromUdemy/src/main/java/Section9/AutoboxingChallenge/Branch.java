package Section9.AutoboxingChallenge;

import java.util.ArrayList;

public class Branch {

  private ArrayList<Customer> customerList = new ArrayList<Customer>();

  public void addCustomer(Customer customer) {
    customerList.add(customer);
  }

  public void addTransaction(double transactionValue) {
    Customer customer = new Customer(transactionValue);

  }

  public void printCustomerList() {
    for (int i = 0; i < customerList.size(); i++) {
      System.out.println("Position " + (i + 1) + ". " + customerList.get(i).getName()
          + ", " + customerList.get(i).getTransactionValue());
    }
  }
}


