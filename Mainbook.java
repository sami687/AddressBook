package com.bl.Addressbook;
import java.util.Scanner;

public class Mainbook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");

		readEntry();
		booklist booklist = new booklist();
		System.out.println("First Nmae is" + booklist.getFirstname());
	}
	public static void readEntry(){
		Scanner s = new Scanner(System.in);
		String firstname,lastname,address,email,city,zip,state,phonenumber;
		booklist booklist = new booklist();
		System.out.println("First Name:" );
		booklist.setFirstname(firstname= s.nextLine()) ;
		System.out.println("First Name:" + firstname );
		System.out.println("Last Name:" );
		booklist.setLastname (lastname= s.nextLine());
		System.out.println("Address" );
		booklist.setAddress (address =s.nextLine());
		System.out.println("Email:" );
		booklist.setEmail (email= s.nextLine());
		System.out.println("City:");
		booklist.setCity(city = s.nextLine());
		System.out.println("State:"); 
		booklist.setState (state= s.nextLine());
		System.out.println("Zip:");
		booklist.setZip(zip = s.nextLine());
		System.out.println("PhoneNumber:");
		booklist.setPhonenumber(phonenumber= s.nextLine());

	}  


}