package Section9.ArrayListChallenge;

import java.util.ArrayList;

public class Contacts {

  private String name;
  private String phoneNumber;
  private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

  public Contacts() {
    this.contactsList = contactsList;
  }

  public Contacts(String name) {
    this.name = name;
    this.phoneNumber = "111";
  }

  public Contacts(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

  private static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);

    }

  public void addContacts(String name, String phoneNumber) {
    if (!findContacts(name, phoneNumber)) {
      Contacts contacts = createContact(name, phoneNumber);
      contactsList.add(contacts);
    }
  }

  public void printContactsList() {
    System.out.println("You have " + contactsList.size() + " contact(s) in your contacts list:");
    for (int i = 0; i < contactsList.size(); i++) {
      System.out.println((i + 1) + ". " + contactsList.get(i));
    }
  }

  public void modifyContacts(int position, Contacts contacts) {
    contactsList.set(position, contacts);
    System.out.println("Contact " + (position + 1) + " has been modified");
  }

  public void removeContacts(int position) {
    contactsList.remove(position);
    System.out.println("Contact " + (position + 1) + " has been removed from contacts list");
  }

  public Contacts findContacts(Contacts contacts) {
    int position = contactsList.indexOf(contacts);
    if (position >= 0) {
      return contactsList.get(position);
    }
    return null;
  }

  private boolean findContacts(String name, String phoneNumber) {
    Contacts contactToCheck = new Contacts(name, phoneNumber);
    if (contactsList.contains(contactToCheck)) {
      System.out.println("The contact exists in contacts list at position " + contactsList
          .indexOf(contactToCheck));
      System.out.println(contactToCheck.toString());
      return true;
    } else {
      return false;

    }
  }

  @Override
  public String toString() {
    return
        "Name = " + name +
            ", Phone number = " + phoneNumber;
  }
}
