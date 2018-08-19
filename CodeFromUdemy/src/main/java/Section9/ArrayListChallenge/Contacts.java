package Section9.ArrayListChallenge;

import java.util.ArrayList;

public class Contacts {

  private String name;
    private String phoneNumber;


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

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);

    }

  private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();


  public void addContacts(Contacts contacts) {
    contactsList.add(contacts);
  }

  public void printContactsList() {
    System.out.println("You have" + contactsList.size() + " contacts in your contacts list");
    for (int i = 0; i <= contactsList.size(); i++) {
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

}
