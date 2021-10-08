package com.bl.Addressbook;

import java.util.Scanner;

public class booklist {
	private String firstname, lastname, address, city, state, phonenumber, zip, email;
	public void booklist(String firstname, String lastname, String address, String city, String state, String email, String phonenumber, String zip)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phonenumber = phonenumber;
		this.zip = zip;
	}

	    public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public String getZip()
	{
		return zip;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}


	@Override
	public String toString() {
		return "Person [ firstname=" + firstname + "   lastname=" + lastname + "   address=" + address + "   city=" + city + "   state="
				+ state + "   phonenumber=" + phonenumber + "   zip=" + zip + " email=" + email + "  ]";
	}

}
