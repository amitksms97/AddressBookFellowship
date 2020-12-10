import java.util.*;
public class AddressBookMain {
	Scanner sc=new Scanner (System.in);
	static final String string_Constant=null;
	static final int integer_Constant=0;
	static final long long_Constant=0;
	static String firstName, lastName, address, city, state;
	int zip;
	long phoneNumber;
	AddressBookMain()
	{
		firstName=string_Constant;
		lastName =string_Constant;
		address=string_Constant;
		city=string_Constant;
		state=string_Constant;
		zip=integer_Constant;
		phoneNumber=long_Constant;
	}
	public void createContact()
	{	
		System.out.println("Enter your first name:");
		firstName=sc.next();
		System.out.println("Enter your last name:");
		lastName=sc.next();
		System.out.println("Enter your email address:");
		address=sc.next();
		System.out.println("Enter your city name:");
		city=sc.next();
		System.out.println("Enter your state name:");
		state=sc.next();
		System.out.println("Enter your zip code:");
		zip=sc.nextInt();
		System.out.println("Enter your phone number:");
		phoneNumber=sc.nextLong();
	}
	public void displayContact()
	{
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Email address: "+address);
		System.out.println("City name: "+city);
		System.out.println("State name: "+state);
		System.out.println("Zip code: "+zip);
		System.out.println("Phone Number: "+phoneNumber);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMain obj=new AddressBookMain();
		obj.createContact();
		obj.displayContact();
	}
}
