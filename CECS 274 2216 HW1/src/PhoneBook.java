/**
 * This class is a simulator for a Phone Book
 * @author Andrew Fung
 * @version 1.0.0
 * @since 2016-02-03
 */
import java.util.*;
public class PhoneBook {
public List<String> Contacts = new ArrayList<String>();
public List<Long> PHnumbers = new ArrayList<Long>();
public List<Long> CellNumber = new ArrayList<Long>();
public List<String> Email = new ArrayList<String>();
public List<String> Notes = new ArrayList<String>();
/**
 * Constructor for Contact Name, Phone Number, Cell Number, Email, Notes
 * @param name add Contact Name to Contacts ArrayList
 * @param phone add Phone Number to PHnumbers ArrayList
 * @param cell add Cell Number to CellNumber ArrayList
 * @param email add Email to Email ArrayList
 * @param notes add Notes to Notes ArrayList
 */
public PhoneBook(String name, long phone, long cell, String email, String notes){
	Contacts.add(name);
	PHnumbers.add(phone);
	CellNumber.add(cell);
	Email.add(email);
	Notes.add(notes);
}
/**
 * Constructor for Contact Name, Email, Notes
 * @param name add Contact Name to Contacts ArrayList
 * @param email add Email to Email ArrayList
 * @param notes add Notes to Notes ArrayList
 */
public PhoneBook(String name, String email, String notes){
	Contacts.add(name);
	PHnumbers.add(null);
	CellNumber.add(null);
	Email.add(email);
	Notes.add(notes);
}
/**
 * Constructor for Contact Name, Email
 * @param name add Contact Name to Contacts ArrayList
 * @param email add Email to Email ArrayList
 */
public PhoneBook(String name, String email){
	Contacts.add(name);
	PHnumbers.add(null);
	CellNumber.add(null);
	Email.add(email);
	Notes.add(null);
}
/**
 * Constructor for Contact Name, Phone Number
 * @param name add Contact Name to Contacts ArrayList
 * @param phone add Phone Number to PHnumbers ArrayList
 */
public PhoneBook(String name, long phone){
	Contacts.add(name);
	PHnumbers.add(phone);
	CellNumber.add(null);
	Email.add(null);
	Notes.add(null);
}
/**
 * Constructor for Contact Name
 * @param name add Contact Name to Contacts ArrayList
 */
public PhoneBook(String name){
	Contacts.add(name);
	PHnumbers.add(null);
	CellNumber.add(null);
	Email.add(null);
	Notes.add(null);
}
/**
 * Adds Contact into Phone Book
 * @param name add Contact name to Contacts ArrayList
 * @param phone add Phone Number to PHnumber ArrayList
 */
public void addContact(String name, long phone){
	Contacts.add(name);
	PHnumbers.add(phone);
	CellNumber.add(null);
	Email.add(null);
	Notes.add(null);
}
/**
 * Adds Contact into Phone Book
 * @param name add Contact Name to Contacts ArrayList
 */
public void addContact(String name){
	Contacts.add(name);
	PHnumbers.add(null);
	CellNumber.add(null);
	Email.add(null);
	Notes.add(null);
}
/**
 * Adds Contact into Phone Book
 * @param name add Contact Name to Contacts ArrayList
 * @param email add Email to Email ArrayList
 */
public void addContact(String name, String email){
	Contacts.add(name);
	PHnumbers.add(null);
	CellNumber.add(null);
	Email.add(email);
	Notes.add(null);
}
/**
 * Adds Contact into Phone Book
 * @param name add Contact Name to Contacts ArrayList
 * @param phone add Phone Number to PHnumbers ArrayList
 * @param cell add Cell Number to CellNumber ArrayList
 * @param email add Email to Email ArrayList
 * @param notes add Notes to Notes ArrayList
 */
public void addContact(String name, long phone, long cell, String email, String notes){
	Contacts.add(name);
	PHnumbers.add(phone);
	CellNumber.add(null);
	Email.add(email);
	Notes.add(notes);
}
/**
 * Changes changes to a certain Contact
 * @param name Contact Name
 * @param editMethod Change data
 * @param editChange data
 */
public void editContact(String name, String editMethod, String editChange){
	//Retrieve index reference
	int index = getNameIndex(name);
	//if index is -1; Contact does not exist
	if(index != -1){
		//Change Phone Number
		if(editMethod == "PhoneNumber"){
		long number = Long.parseLong(editChange);
		PHnumbers.set(index, number);
		}
		//Change Contact Name
		else if(editMethod == "ContactName"){
		Contacts.set(index, editChange);
		}
		//Change Cell Number
		else if(editMethod == "CellNumber"){
		long number = Long.parseLong(editChange);
		CellNumber.set(index, number);
		}
		//Change Email
		else if(editMethod == "Email"){
		Email.set(index, editChange);
		}
		//Change Notes
		else if(editMethod == "Notes"){
		Notes.set(index, editChange);
		}
	}
	else{
		System.out.println("That contact does not exist.");
	}
	
}
/**
 * Displays Contact
 * @param contact 
 */
public void display(String contact){
	//Retrieve Contact index reference
	int index = getNameIndex(contact);
	//If index is -1, contact does not exist
	if(index != -1){
		//Display Contact name
		System.out.print("Contact Name: ");
		if(Contacts.get(index)== null){
		System.out.print(" ");
		}
		else{
		System.out.print(Contacts.get(index));
		}
		System.out.println();
		//Display Phone Number
		System.out.print("Phone Number: ");
		if(PHnumbers.get(index)== null){
		System.out.print(" ");
		}
		else{
		System.out.print(getNumber(PHnumbers.get(index)));
		}
		System.out.println();
		//Display Cell Number
		System.out.print("Cell Number: ");
		if(CellNumber.get(index)== null){
		System.out.print(" ");
		}
		else{
		System.out.print(getNumber(CellNumber.get(index)));
		}
		System.out.println();
		//Display Email
		System.out.print("Email: ");
		if(Email.get(index)== null){
		System.out.print(" ");
		}
		else{
		System.out.print(Email.get(index));
		}
		System.out.println();
		//Display Notes
		System.out.print("Notes: ");
		if(Notes.get(index)== null){
		System.out.print(" ");
		}
		else{
		System.out.print(Notes.get(index));
		}
		System.out.println("\n");
	}
	else{
		System.out.println("That contact does not exist.");
	}
}
/**
 * Displays all Contacts in Phone Book
 */
public void displayAll(){
	for(int i = 0; i<Contacts.size(); i++){
		display(Contacts.get(i));
	}
}
/**
 * Returns the index for the wanted Contact to retrieve data from the same index in other ArrayLists
 * @param name Contact Name
 * @return index of desired Contact Name
 */
public int getNameIndex(String name){
	for(int i = 0; i<Contacts.size(); i++){
		if(Contacts.get(i) == name){
		return i;
		}
	}
	return -1;
}
/**
 * Converts Long Integers to String Phone/Cell Numbers
 * @param number 
 * @return String Phone/Cell Number
 */
public String getNumber(long number){
	//Converts Long to String
	String contact = String.valueOf(number);
	//if contact is length 7, String is *** - **** 
	if(contact.length() == 7){
		String first = contact.substring(0,3);
		String second = contact.substring(3,7);
		String number1 = first + " - " + second;
		return number1;
	}
	//if contact is length 10, String is (***) *** - ****
	else if(contact.length() == 10){
		String first = contact.substring(0,3);
		String second = contact.substring(3,6);
		String third = contact.substring(6,10);
		String number1 = "(" + first + ") " + second + " - " + third;
		return number1;
	}
	else{
		return contact;
	}
}
}
