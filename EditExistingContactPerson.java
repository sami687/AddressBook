package com.bl.Addressbook;
import java.util.Scanner;
import java.util.ArrayList;

public class EditExistingContactPerson {
	ArrayList<booklist> booklist = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int i = 0;
		EditExistingContactPerson obj = new EditExistingContactPerson();{

			while (i == 0) {
				System.out.println("Do you want add new Contact/Edit existing contact/Delete Existing contact: ");
				System.out.println("1.Add details.\n2.Edit details.\n3.Delete details.");
				int choose = sc.nextInt();
				switch (choose) {
				case 1:
					obj.addbooklist();
					break;
				case 2:
					obj.editbooklist();
					break;
				case 3:
					obj.deleteContactDetails();
					break;
				default:
					i = 1;
					System.out.println("Wrong option");
					obj.addbooklist();
					break;
				}
			}
		}
	}
	public void addbooklist() {
		booklist book = new booklist();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name of person : ");
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
		System.out.println(booklist.toString());
	}

	private void editbooklist() {
		System.out.println("Confirm your first name to edit details: ");
		String name = sc.next();

		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getFirstname().equals(name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
				int edit = sc.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter first name");
					booklist.get(i).setFirstname(sc.next());
					break;
				case 2:
					System.out.println("Enter Last name");
					booklist.get(i).setLastname(sc.next());
					break;
				case 3:
					System.out.println("Enter address");
					booklist.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter city");
					booklist.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter state");
					booklist.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter email");
					booklist.get(i).setEmail(sc.next());
					break;
				case 7:
					System.out.println("Enter Zip");
					booklist.get(i).setZip(sc.next());
					break;
				case 8:
					System.out.println("Enter phone number");
					booklist.get(i).setPhonenumber(sc.next());
					break;
				}

				System.out.println(booklist);

			} else
				System.out.println("Enter valid First name");
		}
	}

	public void deleteContactDetails() {

		System.out.println("Confirm your first name to delete details: ");
		String name = sc.next();

		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getFirstname().equals(name)) {
				booklist.remove(i);
			}
		}
	}
}