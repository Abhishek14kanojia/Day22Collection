package com.day22Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	private ArrayList<Contacts> contacts;
    private static Scanner scanner = new Scanner(System.in);;

    public AddressBook() {
        this.contacts = new ArrayList<Contacts>();
    }
    public void addContact() {
        System.out.println("Enter the contact :");
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

        contacts.add(new Contacts(firstName, lastName, city, state, zip, phoneNumber, email));
    }
}
