package com.day22Collection;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

	 private HashMap<String, Contacts> contacts;
	    private static Scanner scanner = new Scanner(System.in);;

	    public AddressBook() {
	        this.contacts = new HashMap<String, Contacts>();
	    }
	    public void editContact() {
	        System.out.println("Enter first name of person you want edit:");
	        String firstName = scanner.nextLine();
	        Contacts contact = contacts.get(firstName.toLowerCase());
	        System.out.println("Select Option:\n1. First Name\n2. Last Name\n 3. City\n4. State\n5. Zip\n6. Phone\n7. Email");
	        int choice = Integer.parseInt(scanner.nextLine());

	        switch (choice) {
	            case 1:
	                System.out.println("Enter new first name:");
	                contacts.remove(firstName);
	                String newName = scanner.nextLine();
	                contact.setFirstName(newName);
	                contacts.put(newName, contact);
	                System.out.println(contact.getFirstName());
	                break;

	            case 2:
	                System.out.println("Enter new last name:");
	                contact.setLastName(scanner.nextLine());
	                break;

	            case 3:
	                System.out.println("Enter new city");
	                contact.setCity(scanner.nextLine());
	                break;

	            case 4:
	                System.out.println("Enter new State");
	                contact.setState(scanner.nextLine());
	                break;

	            case 5:
	                System.out.println("Enter new Zip");
	                contact.setZip(scanner.nextInt());
	                break;

	            case 6:
	                System.out.println("Enter new Phone");
	                contact.setPhoneNumber(scanner.nextLong());
	                break;

	            case 7:
	                System.out.println("Enter new email");
	                contact.setEmail(scanner.nextLine());
	                break;

	            default:
	                System.err.println("Invalid Option");
	        }
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

     contacts.put(firstName.toLowerCase(),(new Contacts(firstName, lastName, city, state, zip, phoneNumber, email)));
 }
}
