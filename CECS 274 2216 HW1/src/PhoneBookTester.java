//package edu.kapiva.hw1;

public class PhoneBookTester {
	public static void main(String[] args){
		//FIRST TEST: Instantiating a phone book with all data: name, phone #, cell #, email, note
		//PhoneBook myContacts = new PhoneBook("Katherine", 5625550000L, 5555555555L, "kapiva@ucla.edu", "My favorite prof"); 
		
		//SECOND TEST: Instantiating a phone book with a contact having: name, email, and note
		//PhoneBook myContacts = new PhoneBook("Katherine", "kapiva@ucla.edu", "My favorite prof"); 
		
		
		//THIRD TEST: Instantiating a phone book with a contact having: name and email
		//PhoneBook myContacts = new PhoneBook("Katherine", "kapiva@ucla.edu"); 
		
		//FOURTH TEST: Instantiating a phone book with a contact having: name and phone number
		//PhoneBook myContacts = new PhoneBook("Katherine", 5625550000L); 
		
		//FIFTH TEST: Instantiating a phone book with: name
		PhoneBook myContacts = new PhoneBook("Katherine");
		
		myContacts.addContact("Tony", 1234567L); //adding a contact with: name and phone #
		myContacts.addContact("Mike"); //adding a contact with: name
		myContacts.addContact("Hector", "hector@somewebsite.com"); //adding a contact with: name and email
		myContacts.addContact("Alma", 1991, 0, "alma@website.edu", "Secretary at X Company"); //adding a name with: name, phone #, email, and note (0 entry for cell # means no number)
		

		myContacts.displayAll(); //displaying all contacts

		
		
		myContacts.editContact("Hector", "PhoneNumber", "9195550505");  //editing Hector's phone # to be (919) 555-0505
		myContacts.editContact("Katherine", "ContactName", "Katherine Varela"); // editing Katherine's name to "Katherine Varela"
		myContacts.editContact("Katherine Varela", "CellNumber", "5625550055");	//editing Katherine Varela's cell # to (562) 555-0055
		myContacts.editContact("Tony", "Email", "tony@coolguy.com"); //editing Tony's email to "tony@coolguy.com"
		myContacts.editContact("Alma", "PhoneNumber", "6789"); //editing Alma's phone # to 6789
		myContacts.editContact("Mike", "Notes", "Owes me lunch"); //editing Mike's notes to "Owes me lunch"
		
		
		
		System.out.println("\n\n\n---------------------AFTER EDITS: ------------------");
		//Display each contact 
		myContacts.display("Hector");
		myContacts.display("Katherine Varela");
		myContacts.display("Tony");
		myContacts.display("Alma");
		myContacts.display("Mike");
		
		
		System.out.println("\n\n\n -----------------ATTEMPT TO EDIT NON-EXISTENT CONTACTS");
		//Attempt to edit a non-existent entry
		myContacts.editContact("Noname", "Notes", "not in this phonebook"); 
		
		System.out.println("\n\n\n -----------------ATTEMPT TO DISPLAY NON-EXISTENT CONTACTS");
		//Attempt to display a non-existent entry
		myContacts.display("Noname");
	}
}