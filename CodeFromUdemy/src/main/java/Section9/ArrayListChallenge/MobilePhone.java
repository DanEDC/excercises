package Section9.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

  private static Scanner scanner = new Scanner(System.in);

  private String myNumber;
  private ArrayList<Contacts> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contacts>();
  }

  public boolean addNewContact(Contacts contacts) {
    if (findContact(contacts.getName()) >= 0) {
      System.out.println("Contact is already on file");
      return false;
    }
    myContacts.add(contacts);
    return true;
  }

  private int findContact(Contacts contacts) {
    return this.myContacts.indexOf(contacts);
  }

  private int findContact(String contactName) {
    for (int i = 0; i < this.myContacts.size(); i++) {
      Contacts contacts = this.myContacts.get(i);
      if (contacts.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;

  }

  public boolean updateContact(Contacts oldContact, Contacts newContact) {
    int foundPosition = findContact(oldContact);
    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + ", was not found");
      return false;
    }

    this.myContacts.set(foundPosition, newContact);
    System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
    return true;
  }

}


//  public static void main(String[] args) {
//    boolean quit = false;
//    int choice = 0;
//    printInstructions();
//    while (!quit) {
//      System.out.println("Enter your choice: ");
//      choice = scanner.nextInt();
//      scanner.nextLine();
//
//      switch (choice) {
//        case 0:
//          printInstructions();
//          break;
//        case 1:
//          contactsList.printContactsList();
//          break;
//        case 2:
//          addContacts();
//          break;
//        case 3:
//          modifyContacts();
//          break;
//        case 4:
//          removeContacts();
//          break;
//        case 5:
//          searchForContacts();
//          break;
//        case 6:
//          quit = true;
//          break;
//      }
//    }
//  }
//
//  public static void printInstructions() {
//    System.out.println("\nPress ");
//    System.out.println("\n 0 - To print choice options.");
//    System.out.println("\n 1 - To print the list of contacts.");
//    System.out.println("\n 2 - To add new contact to the list");
//    System.out.println("\n 3 - To modify a contact in the list");
//    System.out.println("\n 4 - To remove a contact from the list");
//    System.out.println("\n 5 - To search for a contact in the list");
//    System.out.println("\n 6 - To quit the application");
//
//  }
//
//  public static void addContacts() {
//    System.out.println("Please enter name and phone number: ");
//    contactsList.addContacts(Contacts.createContact());
//  }
//
//}
