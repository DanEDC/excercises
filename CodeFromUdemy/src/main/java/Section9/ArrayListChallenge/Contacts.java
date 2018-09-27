package Section9.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Contacts {

    private String name;
    private String phoneNumber;
    private ArrayList<Contacts> contactsList = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public Contacts() {
        this.contactsList = contactsList;
    }

    private Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private String getName() {
        return name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addContacts() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        Contacts contacts = new Contacts(name, phoneNumber);
        int position = contactsList.indexOf(contacts);
        if (contactsList.contains(contacts)) {
            System.out.println("The contact is already in contact list:");
            System.out.println(contactsList.get(position));
        } else {
            contactsList.add(contacts);
            System.out.println("The contact has been added to contact list");
        }
    }

    public void printContactsList() {
        System.out.println("You have " + contactsList.size() + " contact(s) in your contacts list:");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + ". " + contactsList.get(i));
        }
    }

    public void modifyContacts() {
        System.out.println("Enter position number of contact to be modified:");
        int position = scanner.nextInt();
        scanner.nextLine();
        Contacts contactToModify = contactsList.get(position - 1);
        System.out.println("Enter new contact name:");
        contactToModify.setName(scanner.nextLine());
        System.out.println("Enter new contact phone number:");
        contactToModify.setPhoneNumber(scanner.nextLine());
        System.out.println("Contact at position " + (position) + ". has been modified");
    }

    public void removeContacts() {
        System.out.println("Enter position number of contact to be removed:");
        int position = scanner.nextInt();
        contactsList.remove(position - 1);
        System.out.println("Contact at position " + (position) + ". has been removed from contacts list");
    }

    public boolean findContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) {
                System.out.println("Found contact:");
                System.out.println((i + 1) + ". " + contactsList.get(i));
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            System.out.println("Contact not found");
            return false;
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
