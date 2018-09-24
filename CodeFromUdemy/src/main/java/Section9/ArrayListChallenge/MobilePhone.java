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
          //modifyContacts();
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

//  private static void modifyContacts() {
//    System.out.println("Enter position number of contact to be changed:");
//    int positionNumber = scanner.nextInt();
//    myContacts.removeContacts(positionNumber);
//    System.out.println("Enter new contact name:");
//    String newName = scanner.nextLine();
//    System.out.println("Enter new phone number:");
//    String newPhoneNumber = scanner.nextLine();
//    myContacts.modifyContacts(newName, newPhoneNumber);
//  }


  private static void removeContacts() {
    System.out.println("Enter position number to be deleted from contacts list:");
    int positionNumber = scanner.nextInt();
    myContacts.removeContacts(positionNumber);
  }

  private static void searchForContacts() {
    System.out.println("Enter contact name, and then phone number:");
    Contacts contacts = new Contacts(scanner.nextLine(), scanner.nextLine());
//    System.out.println("Enter phone number:");
//    String phoneNumber = scanner.nextLine();
    myContacts.findContacts(contacts);
  }



  private static void addContacts() {
    System.out.println("Enter contact name:");
    String name = scanner.nextLine();
    System.out.println("Enter phone number:");
    String phoneNumber = scanner.nextLine();
    myContacts.addContacts(name, phoneNumber);

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







