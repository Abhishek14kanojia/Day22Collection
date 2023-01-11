package com.day22Collection;

public class Contacts {

	private  String firstName;
    private  String lastName;
    private  String city;
    private  String state;
    private  int zip;
    private  long phoneNumber;
    private  String email;

    public Contacts(String firstName, String lastName, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final String getState() {
		return state;
	}

	public final void setState(String state) {
		this.state = state;
	}

	public final int getZip() {
		return zip;
	}

	public final void setZip(int zip) {
		this.zip = zip;
	}

	public final long getPhoneNumber() {
		return phoneNumber;
	}

	public final void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

}
