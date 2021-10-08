package com.bl.Addressbook;
import java.util.Scanner;

public class AddNewContactAddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
		AddNewContactAddressBook addContact = new AddNewContactAddressBook();
		addContact.addbooklist();

	}
	public void addbooklist() {
		booklist book = new booklist();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name of persn : ");
		book.setFirstname(sc.next());
		System.out.println("Enter the Last name of person : ");
		book.setLastname(sc.next());
		System.out.println("Enter the Address name of person : ");
		book.setAddress(sc.next());
		System.out.println("Enter the City name of person : ");
		book.setCity(sc.next());
		System.out.println("Enter the State name of person : ");
		book.setState(sc.next());
		System.out.println("Enter the Email of person : ");
		book.setEmail(sc.next());
		System.out.println("Enter the Zip of person : ");
		book.setZip(sc.next());
		System.out.println("Enter the Phone Number of person : ");
		book.setPhonenumber(sc.next());
		System.out.println(book.toString());

}
}