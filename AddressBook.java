import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
//create a method to add a contact that's passed as parameters
	publi void addContact(Contact c) {
		friends[numfriends] = c;
		numfriends++;
	}
//creates
	public void printContacts() {
		for(Contact cc: AddressBook)
			friends[cc].printContact();
	}
