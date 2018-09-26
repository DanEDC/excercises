package Section9.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Objects;

public class Contacts {

  private String name;
  private String phoneNumber;
    private ArrayList<Contacts> contactsList = new ArrayList<>();

  public Contacts() {
    this.contactsList = contactsList;
  }

  public Contacts(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

    private String getName() {
        return name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

  private static Contacts createContact(String name, String phoneNumber) {
      return new Contacts(name, phoneNumber);

  }

  public void addContacts(String name, String phoneNumber) {
      Contacts contacts = createContact(name, phoneNumber);
      if (!findContact(contacts)) {
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
      contactsList.set((position - 1), contacts);
      System.out.println("Contact " + (position) + " has been modified");
  }

  public void removeContacts(int position) {
      contactsList.remove(position - 1);
      System.out.println("Contact at position " + (position) + ". has been removed from contacts list");
  }

    public boolean findContact(Contacts contacts) {
    int position = contactsList.indexOf(contacts);
    if (position >= 0) {
        System.out.println("Found existing contact:");
        printSingleContact(contacts);
        return true;

    }
        return false;
  }

    public boolean findContact(String name) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) {
                System.out.println("Found contact:");
                System.out.println((i + 1) + ". " + contactsList.get(i));
                return true;
            } else {
                i++;
            }
        }
        System.out.println("Contact not found");
        return false;
    }

    public void printSingleContact(Contacts contacts) {
        int position = contactsList.indexOf(contacts);
        System.out.println((position + 1) + ". " + contactsList.get(position));
    }

    private void printSingleContact(String name) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().contains(name)) {
                System.out.println((i + 1) + ". " + contactsList.get(i));

            }
        }


    }

  @Override
  public String toString() {
    return
            "Name = " + name + ", Phone number = " + phoneNumber;
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return Objects.equals(getName(), contacts.getName()) &&
                Objects.equals(getPhoneNumber(), contacts.getPhoneNumber()) &&
                Objects.equals(contactsList, contacts.contactsList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getPhoneNumber(), contactsList);
    }
}
