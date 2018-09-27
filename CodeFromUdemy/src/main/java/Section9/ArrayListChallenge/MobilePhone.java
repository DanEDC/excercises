package Section9.ArrayListChallenge;

import java.util.Scanner;

public class MobilePhone {

  private static Scanner scanner = new Scanner(System.in);

  private static Contacts myContacts = new Contacts();


  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;
    printInstructions();
    while (!quit) {
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          printContactsList();
          break;
        case 2:
          addContacts();
          break;
        case 3:
          modifyContacts();
          break;
        case 4:
          removeContacts();
          break;
        case 5:
          searchForContacts();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  private static void modifyContacts() {
    myContacts.modifyContacts();
  }

  private static void removeContacts() {
    myContacts.removeContacts();
  }

  private static void searchForContacts() {
    myContacts.findContact();
  }

  private static void addContacts() {
    myContacts.addContacts();

  }

  private static void printContactsList() {
    myContacts.printContactsList();

  }

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\n 0 - To print choice options.");
    System.out.println("\n 1 - To print the list of contacts.");
    System.out.println("\n 2 - To add new contact to the list");
    System.out.println("\n 3 - To modify a contact in the list");
    System.out.println("\n 4 - To remove a contact from the list");
    System.out.println("\n 5 - To search for a contact in the list");
    System.out.println("\n 6 - To quit the application");
  }

}







