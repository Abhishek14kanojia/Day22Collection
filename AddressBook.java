package com.day22Collection;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

	private Contacts[] contacts;
    private static Scanner scanner = new Scanner(System.in);
    private int noOfContacts;
    private int addressBookId;

    public AddressBook(int id) {
        this.contacts = new Contacts[10];
        this.noOfContacts = 0;
        this.addressBookId = id;
    }
    public void editContact() {
        System.out.println("Enter phone of person you want edit:");
        long phone = scanner.nextLong();
        Contacts contactToEdit = null;
        for(Contacts contact : contacts) {
            if(contact.getPhoneNumber() == (phone)) {
                contactToEdit = contact;
                break;
            }
        }
        System.out
                .println("Select Option:\n1. First Name\n2. Last Name\n 3. City\n4. State\n5. Zip\n6. Phone\n7. Email");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Enter new first name:");
                String newName = scanner.nextLine();
                contactToEdit.setFirstName(newName);
                break;

            case 2:
                System.out.println("Enter new last name:");
                contactToEdit.setLastName(scanner.nextLine());
                break;

            case 3:
                System.out.println("Enter new city");
                contactToEdit.setCity(scanner.nextLine());
                break;

            case 4:
                System.out.println("Enter new State");
                contactToEdit.setState(scanner.nextLine());
                break;

            case 5:
                System.out.println("Enter new Zip");
                contactToEdit.setZip(scanner.nextInt());
                break;

            case 6:
                System.out.println("Enter new Phone");
                contactToEdit.setPhoneNumber(scanner.nextLong());
                break;

            case 7:
                System.out.println("Enter new email");
                contactToEdit.setEmail(scanner.nextLine());
                break;

            default:
                System.err.println("Invalid Option");
        }
    }
    public void deleteContact() {
        System.out.println("Enter phone number of person you want to delete:");
        long phone = scanner.nextLong();
        int index=0;
        for(;index<noOfContacts;index++) {
            if(contacts[index].getPhoneNumber() == (phone)) {
                break;
            }
        }
        for(;index<noOfContacts-1;index++) {
            contacts[index] = contacts[index+1];
        }
        System.out.println("Successfully Deleted");
    }
    public void addContact() {
        System.out.println("Enter the contact details:");
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter city");
        String city = scanner.nextLine();
        System.out.println("Enter state");
        String state = scanner.nextLine();
        System.out.println("Enter Zip");
        int zip = scanner.nextInt();
        System.out.println("Enter Phone");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter email");
        String email = scanner.nextLine();

        contacts[noOfContacts++] = new Contacts(firstName, lastName, city, state, zip, phoneNumber, email);
    }

}
