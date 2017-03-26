import java.util.*;
public class Contact{
	private ArrayList <String> contacts;
public int getNameIndex(String name){
	for(int i = 0; i<contacts.size(); i++){
		if(contacts.get(i) == name){
		return i;
		}
	}
	return -1;
}
public String getNumber(long number){
	String contact = String.valueOf(number);
	if(contact.length() == 7){
		String first = contact.substring(0,3);
		String second = contact.substring(3,7);
		String number1 = first + " - " + second;
		return number1;
	}
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
public void displayName(){
	for(int i = 0; i < contacts.size(); i++){
		System.out.println(contacts.get(i));
	}
}
}
